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
 * Servlet implementation class RechercheContactServlet
 */
@WebServlet("/RechercheContactServlet")
public class RechercheContactServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	 /**
     * @see HttpServlet#HttpServlet()
     */
	public RechercheContactServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		long id=Long.parseLong(request.getParameter("id"));
		
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
	         
	    IServiceContact cservice = (IServiceContact) context.getBean("contactService");
		cservice.getContact(id);
	}

}
