package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

/**
 * alt*SHIFT*J API주석/회원 조회목록구현
 */
//basic


@WebServlet(value="/member/list")
public class MemberListServlet extends HttpServlet {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
			// TODO Auto-generated method stub
//		JDBC 수행순서 java data base 커넥터
//		DB 객체준비 연결,상태,결과
		Connection conn = null;
		PreparedStatement pstmt = null;;
		ResultSet rs = null;
		
		
		try {
			
			ServletContext sc =this.getServletContext();
			
			//미리 준비된 DB객체 불러오기
			conn = (Connection)sc.getAttribute("conn");
		
		
			
//			sql실행 객체 준비			
			String sql = "";
			
			
			sql +="SELECT MEMBER_NO,EMAIL,PWD,MEMBER_NAME,CRE_DATE ";
			sql +="FROM MEMBER ";
			sql +="ORDER BY MEMBER_NO ASC";
			pstmt = conn.prepareStatement(sql);
			//db에 sql문 전달
			rs = pstmt.executeQuery();
			
		
			
			//db에서 가져온 데이터를 담는다 컨트롤러의 역할
			ArrayList<MemberDto> memberList = new ArrayList<MemberDto>();
			
			int memberNo = 0;
			String memberName ="";
			String	email = "";
			Date creDate = null;
			
			MemberDto memberDto = null;
			while (rs.next()) {
				 memberNo =  rs.getInt("MEMBER_NO");
				 memberName = rs.getString("MEMBER_NAME");
					email =	rs.getString("EMAIL");
				 creDate =	rs.getDate("CRE_DATE");	
				 
				 memberDto = new MemberDto();
				 
				 memberDto.setmemberNo(memberNo);
				 memberDto.setMemberName(memberName);
				 memberDto.setEmail(email);
				 memberDto.setCreateDate(creDate);
				 
				 memberList.add(memberDto);
			}
			//request->데이터보관소영역
			//화면
			request.setAttribute("memberList", memberList);
			
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/member/MemberListView.jsp");
			
			dispatcher.include(request, response);
		}
			
//3대 예외처리
		
		catch (Exception e) {
			e.printStackTrace();
			
			
//			throw new ServletException(e);
			
			request.setAttribute("error", e);
			request.setAttribute("caseByCase","상황에맞는처리부탁");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Error.jsp");
			dispatcher.forward(request, response);
			//forward->건내주다
			
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
