package spms.servlets;
//test
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import spms.dto.MemberDto;

@SuppressWarnings("serial")
@WebServlet(value="/member/list")
public class MemberListServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		JDBC 수행순서 java data base 커넥터
//		DB 객체준비 연결,상태,결과
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
	
		
		
	
	
		try {
			
			
			ServletContext sc = this.getServletContext();
			
			
			conn = (Connection)sc.getAttribute("conn");
//			오라클 객체불러오기
			
			
			
			String sql = "";
			
			sql += "SELECT MEMBER_NO,EMAIL,PWD,MEMBER_NAME,CRE_DATE,MOD_DATE";
			sql += " FROM MEMBER";
			sql += " ORDER BY MEMBER_NO ASC";
			
			pstmt = conn.prepareStatement(sql);
			//db에 sql문 전달
			rs = pstmt.executeQuery();
			
			//db에서 가져온 데이터를 담는다 컨트롤러의 역할
			ArrayList<MemberDto> memberList = new ArrayList<MemberDto>();
			
			int memberNo = 0;
			String memberName ="";
			String	email = "";
			Date creDate = null;
			Date modDate = null;
			MemberDto memberDto = null;
			
			while (rs.next()) {
				 memberNo =  rs.getInt("MEMBER_NO");
				 memberName = rs.getString("MEMBER_NAME");
					email =	rs.getString("EMAIL");
				 creDate =	rs.getDate("CRE_DATE");	
				 modDate =rs.getDate("MOD_DATE");
				 memberDto = new MemberDto();
			
				 memberDto.setmemberNo(memberNo);
				 memberDto.setmemberName(memberName);
				 memberDto.setEmail(email);
				 memberDto.setCreateDate(creDate);
				 memberDto.setModifiedDate(modDate);
				 memberList.add(memberDto);
			}
			//request->데이터보관소영역
			//화면
			request.setAttribute("memberList", memberList);
			
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/member/MemberListView.jsp");
			
			dispatcher.include(request, response);
//3대 예외처리			
		}	
		 catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			request.setAttribute("caseByCase","상황에맞는처리부탁");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Error.jsp");
			dispatcher.forward(request, response);
		}
		
		finally {
//			db 객체 메모리해제 역순으로
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
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}


	
}


