package com.lip6.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lip6.services.IServiceContact;
import com.lip6.services.ServiceContact;

/**
 * Servlet implementation class UpdateContactServlet
 */
@WebServlet("/UpdateContactServlet")
public class UpdateContactServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
	public UpdateContactServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		long id=Long.parseLong(request.getParameter("contactId"));
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String street=request.getParameter("street");
        String country =request.getParameter("country");
        String city=request.getParameter("city");
        String zip=request.getParameter("zip");
        String phoneNum =request.getParameter("phoneNum");
        String phoneKind = request.getParameter("phoneKind");
        String grp = request.getParameter("group");
		
		 WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
         
	    IServiceContact cservice = (IServiceContact) context.getBean("contactService");
		cservice.updateContact(id, fname, lname, email,street,country,city,zip,phoneNum,phoneKind,grp);
	}

}