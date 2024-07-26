package spms.servlets;

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
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import spms.dto.MemberDto;
//test
@SuppressWarnings("serial")
@WebServlet(value="/member/update")
public class MemberUpdateServlet extends HttpServlet {
	/* service의 기능을 분리-doget/dopost */
	
	@Override 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		ServletContext sc = this.getServletContext();
		
		
		String driver = sc.getInitParameter("driver");
		String url = sc.getInitParameter("url");
		String user =sc.getInitParameter("user");
		String password =sc.getInitParameter("password");
		//db조회를 위해, 화면을 데이터 기반으로 구성되기 위해 필요한 데이터
		// Cannot parse null string 왜오류가날까? update?memberNo=1이런식
		
		  int memberNo = 0;
		memberNo = Integer.parseInt(request.getParameter("memberNo"));
		
		String sql ="";
		 
		try {
			
			Class.forName(driver);
			System.out.println("오라클 드라이버 로드");
			conn =DriverManager.getConnection(url, user, password);
			
			sql +="SELECT MEMBER_NO, EMAIL,PWD, MEMBER_NAME, CRE_DATE, MOD_DATE";
			sql +=" FROM MEMBER ";
			sql +=" WHERE MEMBER_NO = ?";

			pstmt= conn.prepareStatement(sql);
			
			pstmt.setInt(1, memberNo);

			
			rs = pstmt.executeQuery();
			
		
			ArrayList<MemberDto> memberList = new ArrayList<MemberDto>();
			
			
			String memberName ="";
			String	email = "";
			String	pwd = "";
			Date creDate = null;
			Date modDate = null;
			MemberDto memberDto = null;
			
			while (rs.next()) {
				 memberNo =  rs.getInt("MEMBER_NO");
				 memberName = rs.getString("MEMBER_NAME");
					email =	rs.getString("EMAIL");
					pwd =	rs.getString("PWD");
				 creDate =	rs.getDate("CRE_DATE");	
				 modDate =rs.getDate("MOD_DATE");
				 memberDto = new MemberDto();
				 
				 memberDto.setmemberNo(memberNo);
				 memberDto.setmemberName(memberName);
				 memberDto.setEmail(email);
				 memberDto.setPassword(pwd);
				 memberDto.setCreateDate(creDate);
				 memberDto.setModifiedDate(modDate);
				 memberList.add(memberDto);
			}
			

			request.setAttribute("memberDto", memberDto);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/member/MemberUpdateView.jsp");

			dispatcher.include(request, response);
			
			
			
			System.out.println("회원 상세 정보 수정페이지 잘되나?");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("error", e);
			request.setAttribute("caseByCase","상황에맞는처리부탁");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Error.jsp");
			dispatcher.forward(request, response);
		}
		finally {
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
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}  //finallyend
		
		
		
		
		
		
	
	}
	//request 클라이언트 
	@Override 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		ServletContext sc = this.getServletContext();
		
		String driver = sc.getInitParameter("driver");
		String url = sc.getInitParameter("url");
		String user =sc.getInitParameter("user");
		String password =sc.getInitParameter("password");
		
		try {
			String emailStr = request.getParameter("email");
			String nameStr = request.getParameter("memberName");
			String pwdStr = request.getParameter("pwd");
			
			int memberNo = Integer.parseInt(request.getParameter("memberNo"));
			
			Class.forName(driver);
			conn =DriverManager.getConnection(url, user, password);
			
			String sql ="";
	
			sql +="UPDATE MEMBER ";
			sql +=" SET  EMAIL =?, PWD=?, MEMBER_NAME= ? ";
			sql +=" WHERE  MEMBER_NO = ?";
			
			
			
			pstmt= conn.prepareStatement(sql);
			
			pstmt.setString(1, emailStr);
			pstmt.setString(2, pwdStr);
			pstmt.setString(3, nameStr);
			pstmt.setInt(4, memberNo);
			 
			 
			pstmt.executeUpdate();
		
			response.sendRedirect("./list");
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
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
		}  //finallyend
		
	}
	
}
