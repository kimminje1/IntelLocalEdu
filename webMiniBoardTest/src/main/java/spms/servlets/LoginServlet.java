package spms.servlets;
//test
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import spms.dto.MemberDto;

@SuppressWarnings("serial")
@WebServlet(value="/auth/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = req.getRequestDispatcher("./LoginForm.jsp");
		rd.forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
	Connection conn = null;
	PreparedStatement pstmt = null;;
	ResultSet rs = null;
	
	
	
	
	try {
		
		ServletContext sc =this.getServletContext();
		
		//미리 준비된 DB객체 불러오기
		conn = (Connection)sc.getAttribute("conn");
	
		String email =req.getParameter("email");
		String pwd =req.getParameter("password");
		String memberName ="";
		int memberNo=0;
//		sql실행 객체 준비			
		String sql = "";
		int colInex = 1;
		
		sql += "SELECT MEMBER_NO, EMAIL, MEMBER_NAME";
		sql += " FROM MEMBER";
		sql += " WHERE EMAIL =? AND PWD =?";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(colInex++, email);
		pstmt.setString(colInex, pwd);
		
		
		rs = pstmt.executeQuery();
		
		if (rs.next() == true) {
		
				
			memberNo =  rs.getInt("MEMBER_NO");	 
			email = rs.getString("EMAIL");
			memberName = rs.getString("MEMBER_NAME");
			
			MemberDto memberDto = new MemberDto();
			 
             memberDto.setEmail(email);
             memberDto.setmemberName(memberName);
             memberDto.setmemberNo(memberNo);
             
			HttpSession session = req.getSession();
			session.setAttribute("memberDto", memberDto);
			
			res.sendRedirect("../member/list");
			}
			else {
				RequestDispatcher dispatcher
				= req.getRequestDispatcher("LoginFail.jsp");
				 
				dispatcher.forward(req, res);
				
								
			}
	
	}
		
//3대 예외처리
	
	catch (Exception e) {
		e.printStackTrace();
		
		
//		throw new ServletException(e);
		
		req.setAttribute("error", e);
		req.setAttribute("caseByCase","상황에맞는처리부탁");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/Error.jsp");
		dispatcher.forward(req, res);
		//forward->건내주다
		
	}
	finally {
//		db 객체 메모리해제 역순으로
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} /* finally 종료 */
	
		
	}
	
}
