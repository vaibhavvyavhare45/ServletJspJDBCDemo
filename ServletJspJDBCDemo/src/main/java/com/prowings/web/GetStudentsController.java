package com.prowings.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prowings.web.dao.StudentsDao;
import com.prowings.web.model.Students;


public class GetStudentsController extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int id=Integer.parseInt(request.getParameter("sid"));
		StudentsDao dao=new StudentsDao();
		Students s1=dao.getStudents(id);
		
//		request.setAttribute("mukund", s1);
//		
//		RequestDispatcher rd=request.getRequestDispatcher("showStudents.jsp");		
//		rd.forward(request, response);
		
		HttpSession session=request.getSession();
		session.setAttribute("mukund", s1);
		response.sendRedirect("showStudents.jsp");
		
	}

	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
