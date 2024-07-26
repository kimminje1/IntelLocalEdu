package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import spms.dto.MemberDto;
//test
@WebServlet(value="/member/add")
@SuppressWarnings("serial")
public class MemberAddServlet extends HttpServlet {
	/* service의 기능을 분리-doget/dopost */

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.err.println("doGet을 수행");
		ArrayList<MemberDto> memberList = new ArrayList<MemberDto>();
		
		/*
		 * int memberNo = 0; String memberName =""; String email = ""; Date creDate =
		 * null; Date modDate = null; MemberDto memberDto = null;
		 * 
		 * while (rs.next()) { memberNo = rs.getInt("MEMBER_NO"); memberName =
		 * rs.getString("MEMBER_NAME"); email = rs.getString("EMAIL"); creDate =
		 * rs.getDate("CRE_DATE"); modDate =rs.getDate("MOD_DATE"); memberDto = new
		 * MemberDto();
		 * 
		 * memberDto.setmemberNo(memberNo); memberDto.setMembername(memberName);
		 * memberDto.setEmail(email); memberDto.setCreateDate(creDate);
		 * memberDto.setModifiedDate(modDate); memberList.add(memberDto); }
		 */
		//request->데이터보관소영역
		//화면
		request.setAttribute("memberList", memberList);
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/member/MemberAddView.jsp");
		
		dispatcher.include(request, response);
		/*
		 * htmlStr += "</form>"; htmlStr +=
		 * "이름: <input type='text' name='memberName'><br>"; htmlStr +=
		 * "이메일: <input type='text' name='email'><br>"; htmlStr +=
		 * "암호: <input type='password' name='password'><br>"; htmlStr +=
		 * "<input type='submit' value='추가'>"; htmlStr +=
		 * "<input type='button' value='회원목록으로'" +
		 * " onclick ='location.href=\"./list\"'>"; htmlStr +=
		 * "<input type='reset' value='취소'>"; htmlStr += "</form>";
		 */
		
		
	
	}
	//req 클라이언트 
	@Override 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		
		
		String driver = "";
		String url = "";
		String user ="";
		String password ="";
		
		try {
			ServletContext sc = this.getServletContext();
			 driver = sc.getInitParameter("driver");
			 url = sc.getInitParameter("url");
			 user =sc.getInitParameter("user");
			 password =sc.getInitParameter("password");
			 
			 
			String emailStr = request.getParameter("email");
			String pwdStr = request.getParameter("password");
			String memberStr = request.getParameter("memberName");
			
			Class.forName(driver);
			conn =DriverManager.getConnection(url, user, password);
			
			String sql ="";
			
			sql +="INSERT INTO MEMBER ";
			sql +="(MEMBER_NO, EMAIL, PWD, MEMBER_NAME, CRE_DATE, MOD_DATE) ";
			sql +="VALUES(MEMBER_NO_SEQ.NEXTVAL, ?, ?, ?, SYSDATE, SYSDATE)";
			
			pstmt= conn.prepareStatement(sql);
			
			
			 pstmt.setString(1, emailStr);
			 pstmt.setString(2, pwdStr);
			 pstmt.setString(3, memberStr);
			 
			pstmt.executeUpdate();
			
			//다른 화면 혹은 다른 서블릿을 호출하는 메서드
			response.sendRedirect("./list");
			
			
			//사용자에게 백단에서 무슨일이 벌어진건지 알려주는 화면을 제작해야함
//			res.setContentType("text/html");
//			res.setCharacterEncoding("UTF-8");
//			
//			PrintWriter out = res.getWriter();
			
//			String htmlStr = "";
//			
//			htmlStr += "<html>";
//			htmlStr += "<head>";
//			htmlStr += "<meta charset='UTF-8'>";
//			/*
//			 * htmlStr +=
//			 * "<meta charset='UTF-8'http-equiv='Refresh' content='2; url=list'>";
//			 */
//			htmlStr += "<title>회원 등록 결과</title>";
//			htmlStr += "</head>";
//			htmlStr += "<body>";
//			htmlStr += "<p> ";
//			htmlStr += "등록 성공입니다!";
//			htmlStr += "</p>";
//			htmlStr += "</body>";
//			htmlStr += "</html>";
//		
//			out.println(htmlStr);
//			response.sendRedirect("./list");
			response.addHeader("Refresh","20; url=./list");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("error", e);
			request.setAttribute("caseByCase","상황에맞는처리부탁");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Error.jsp");
			dispatcher.forward(request, response);
		}
		finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
