package com.lip6.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lip6.daos.IDAOContact;
import com.lip6.entities.Contact;
import com.lip6.services.IServiceContact;

/**
 * Servlet implementation class AddContactServlet
 */
@WebServlet("/AddContactServlet")
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email"); 
		
		String[] allBeanNames = context.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName + "******************");
        }
		IDAOContact dao = (IDAOContact)context.getBean("cdao1");
		dao.addContact(fname,lname,email);
		
		IServiceContact cservice = (IServiceContact) context.getBean("contactService");
		cservice.createContact((Contact) context.getBean("contact1"));
		
		
	}

}
