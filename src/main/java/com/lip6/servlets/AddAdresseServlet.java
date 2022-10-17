package com.lip6.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lip6.daos.DAOAddress;
import com.lip6.daos.IDAOAddress;

/**
 * Servlet implementation class AddContactServlet
 */
@WebServlet("/AddAdresseServlet")
public class AddAdresseServlet extends HttpServlet{
    
    private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAdresseServlet() {
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
        
        String street=request.getParameter("street");
        String country=request.getParameter("country");
        String city=request.getParameter("city"); 
        String zip=request.getParameter("zip"); 
        
        DAOAddress daoa = (DAOAddress )context.getBean("adao");
        daoa.addAddress(street, country, city, zip);
        
        
    }

}
