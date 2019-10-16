package fr.gtm.demo.servlets;

import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger("DEMO");

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Writer out = response.getWriter();
		String nom = request.getParameter("nom");
		if(nom==null) {
			nom = "Jean-Pierre";
		}
		Enumeration<String> fields = request.getParameterNames();
		while(fields.hasMoreElements()) {
			String field = fields.nextElement();
			LOG.info(field+" "+request.getParameter(field));
		}
		out.append("<html><head><title>Hello ")
			.append(nom)
			.append("</title></head>")
			.append("<body><h2>Bonjour ")
			.append(nom)
			.append("</h2></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
