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
//basic
@SuppressWarnings("serial")
@WebServlet(value="/member/delete")
public class MemberDeleteServlet extends HttpServlet {
	/* service의 기능을 분리-doget/dopost */
	
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
		// TODO Auto-generated method stub

		
//		사용자가 입력한영어이외의 글자들이 깨지는것을 방지하는 코드;	
//		req.setCharacterEncoding("UTF-8");
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
		
		String deleteSql ="";
		String selectSql  ="";
		 
		try {
			
			Class.forName(driver);
			System.out.println("오라클 드라이버 로드");
			conn =DriverManager.getConnection(url, user, password);
			//SELECT 이름가져오기
			selectSql  += "SELECT MEMBER_NAME";
			selectSql  += " FROM MEMBER";
			selectSql  += " WHERE MEMBER_NO = ?";
			pstmt = conn.prepareStatement(selectSql);
			pstmt.setInt(1, memberNo);
			rs = pstmt.executeQuery();
			
			String memberName = "";
			if (rs.next()) {
				memberName = rs.getString("MEMBER_NAME");	
			}
			
		
			//DELETE문 실행
			deleteSql +="DELETE";
			deleteSql +=" FROM MEMBER";
			deleteSql +=" WHERE MEMBER_NO = ?";

			pstmt= conn.prepareStatement(deleteSql);
			
			pstmt.setInt(1, memberNo);

			
			pstmt.executeUpdate();
			
		
			
			//사용자에게 백단에서 무슨일이 벌어진건지 알려주는 화면을 제작해야함
			res.setContentType("text/html");
			res.setCharacterEncoding("UTF-8");
			
			PrintWriter out = res.getWriter();
			
				
			String htmlStr = "";
			
			htmlStr += "<html>";
			htmlStr += "<head>";
			htmlStr += "<meta charset='UTF-8'>	";
			htmlStr += "<title>회원 삭제</title>";
			htmlStr += "</head>";
			htmlStr += "<body>";
			htmlStr += "<h1>"+memberName+"회원 삭제</h1>";
			htmlStr += "<form action='./delete' method='post'>";
			htmlStr += "<input type='button' value='회원목록으로'"
					+ " onclick ='location.href=\"./list\"'>";
			htmlStr += "</form>";
			htmlStr += "</body>";
			htmlStr += "</html>";
		
			
			out.println(htmlStr);
			res.addHeader("Refresh","20; url=./list");
			System.out.println("삭제잘되나?");
			
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
		
		res.setContentType("text/html");
		res.setCharacterEncoding("UTF-8");
		PrintWriter out =res.getWriter();
		
		
		
		
	
	}
	//req 클라이언트 
	@Override 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		 
		
	}
	
}
