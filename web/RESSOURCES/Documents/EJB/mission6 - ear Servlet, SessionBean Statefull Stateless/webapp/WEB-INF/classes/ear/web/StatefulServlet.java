package ear.web;

import java.io.*;
import javax.naming.*;
import javax.servlet.*;
import javax.servlet.http.*;

import ear.ejb.stateful.StatefulInterface;
import ear.pojo.Pojo2;		//****************************


public class StatefulServlet extends HttpServlet {

	HttpServletRequest 	request;
	HttpServletResponse response;
	PrintWriter 		out;

	HttpSession 		session;
	StatefulInterface 	proxyStateful;
	String			nombre;

	int compteur = 0;

	static {
		System.out.println("class StatefulServlet loadee");
	}

	public StatefulServlet() {
		super();
		System.out.println("un StatefulServlet cree");
	}

	protected void finalize() throws Throwable {
		System.out.println("un StatefulServlet disparait");
		super.finalize();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("StatefulServlet.compteur=" + (compteur++) );
		System.out.println("StatefulServlet.doGet()");

		request = req;
		response = res;
		response.setContentType("text/html");
		out =response.getWriter();
		connexion();
		out.println("depuis la servlet Pojo2.fac(5)=" + Pojo2.fac(5) + "<br/>");	//*********
		out.println("depuis la servlet Pojo2.fibo(5)=" + Pojo2.fibo(5) + "<br/>");	//*********
		out.println("depuis l EJB proxyStateful.fac(5)=" + proxyStateful.fac(5) + "<br/>");
		out.println("depuis l EJB proxyStateful.fibo(5)=" + proxyStateful.fibo(5) + "<br/>");
		nombre = request.getParameter("nombre");
		if (nombre!=null) {
			int n = Integer.parseInt(nombre);
			out.println("total="+proxyStateful.incremente(n));
		}
		else {
			out.println("total="+proxyStateful.incremente(0));
		}
		afficheFormulaire();
		out.close();
	}
	public void connexion() {
		session = request.getSession(true);
		proxyStateful = (StatefulInterface) session.getAttribute("proxyStateful");			
		if(proxyStateful == null) {
			try {
				Context ctx=new InitialContext();
				proxyStateful =(StatefulInterface) ctx.lookup("enterprise/StatefulSessionBean/local");
				session.setAttribute("proxyStateful", proxyStateful);
			} catch (NamingException ne) {
				out.println(ne.toString());
			}
		}	
		out.println("jsessionid : " + session.getId() + "<br/>");
		out.println("proxyStateful : " + proxyStateful + "<br/>");
	}	
	void afficheFormulaire() {
		out.println("<form method='get' action='"+response.encodeURL("StatefulServlet")+"'>");
		out.println("nombre<input name='nombre' />");
		out.println("<input type='submit' value='submit' />");
		out.println("</form>");
	}	
}
