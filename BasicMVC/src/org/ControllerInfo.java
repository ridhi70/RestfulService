package org;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerInfo
 */
@WebServlet("/ControllerInfo")
public class ControllerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerInfo() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().println(request.getParameter("name")+ "<br/>");
		response.getWriter().println(request.getParameter("gender")+ "<br/>");
		
		PrintWriter out= response.getWriter();
		String[] languages = request.getParameterValues("language");
		if(languages != null) {
			for(int i=0;i<languages.length;i++) {
				out.print(languages[i]);
				out.print("<br/>");
			}
		}else {
			out.print("No languages selected"+"<br/>");
		}
		
		response.getWriter().println(request.getParameter("country")+ "<br/>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
