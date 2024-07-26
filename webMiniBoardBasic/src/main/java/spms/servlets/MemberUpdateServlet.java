package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//BASIC
@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/member/update"})
public class MemberUpdateServlet extends HttpServlet {
	/* service의 기능을 분리-doget/dopost */
	
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
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
		int memberNo = Integer.parseInt(req.getParameter("memberNo"));
		
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
			
		
			String memberName = "";
			String email ="";
			String pwd ="";
			Date creDate = null; //자바 유틸데이트
			Date modDate = null;
			
			while (rs.next()) {
				
				memberName = rs.getString("MEMBER_NAME");
				email = rs.getString("EMAIL");
				pwd = rs.getString("PWD");
				creDate = rs.getDate("CRE_DATE");
				modDate = rs.getDate("MOD_DATE");
							
			}
			
			//사용자에게 백단에서 무슨일이 벌어진건지 알려주는 화면을 제작해야함
			res.setContentType("text/html");
			res.setCharacterEncoding("UTF-8");
			
			PrintWriter out = res.getWriter();
			
			
			
			String htmlStr = "";
			
			htmlStr += "<html>";
			htmlStr += "<head>";
			htmlStr += "<meta charset='UTF-8'>	";
			htmlStr += "<title>회원 등록</title>";
			htmlStr += "</head>";
			htmlStr += "<body>";
			htmlStr += "<h1>회원 등록</h1>	";
			htmlStr += "<form action='./update' method='post'>";
			htmlStr += "번호: <input type='text' name='memberNo' value='"+ memberNo +"'"
					+ " readonly='readonly'><br>";
			htmlStr += "이름: <input type='text' name='memberName' value='"+ memberName + "'><br>";
			htmlStr += "이메일: <input type='text' name='email' value='"+ email + "'><br>	";
			htmlStr += "비밀번호: <input type='text' name='pwd' value='"+ pwd + "'><br>";
			htmlStr += "가입일: " + creDate + "<br>";
			htmlStr += "수정일: " + modDate + "<br>";
			htmlStr += "<input type='submit' value='정보 수정'>";
			htmlStr += "<input type='button' value='삭제' onclick='location.href=\"./delete?memberNo=" 
					+ memberNo+ "\"'>";
			htmlStr += "<input type='button' value='취소'"
					+ " onclick ='location.href=\"./list\"'>";
			htmlStr += "</form>";
			htmlStr += "</body>";
			htmlStr += "</html>";
			
			
			out.println(htmlStr);
			
			System.out.println("회원 상세 정보 수정페이지 잘되나?");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
	//req 클라이언트 
	@Override 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
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
			String emailStr = req.getParameter("email");
			String nameStr = req.getParameter("memberName");
			String pwdStr = req.getParameter("pwd");
			
			int memberNo = Integer.parseInt(req.getParameter("memberNo"));
			
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
		
			res.sendRedirect("./list");
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
