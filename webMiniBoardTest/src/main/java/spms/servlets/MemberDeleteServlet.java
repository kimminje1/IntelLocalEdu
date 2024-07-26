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
import jakarta.servlet.http.HttpSession;
import spms.dto.MemberDto;
//test
@SuppressWarnings("serial")
@WebServlet(value="/member/delete")
public class MemberDeleteServlet extends HttpServlet {
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
			
		
			
			ArrayList<MemberDto> memberList = new ArrayList<MemberDto>();
			req.setAttribute("memberList", memberList);
			
			req.setAttribute("memberName",memberName);
			
			/*
			 * RequestDispatcher dispatcher =
			 * req.getRequestDispatcher("/member/MemberDeleteView.jsp");
			 */
			HttpSession session = req.getSession();
			MemberDto memberDto = (MemberDto) session.getAttribute("memberDto");
			
			
				if (memberNo == memberDto.getmemberNo()) {
	                session.invalidate();
	                res.sendRedirect(req.getContextPath() + "/auth/logout");
	              
	            } else {
	                RequestDispatcher dispatcher
	                = req.getRequestDispatcher("/member/MemberDeleteView.jsp");
	                dispatcher.forward(req, res);
	            }
			
			/* dispatcher.forward(req, res); */
			
			System.out.println("삭제잘되나?");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			req.setAttribute("error", e);
			req.setAttribute("caseByCase","상황에맞는처리부탁");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/Error.jsp");
			dispatcher.forward(req, res);
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
	//req 클라이언트 
	@Override 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		 
		
	}
	
}
