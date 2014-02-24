package ear.web;

import java.io.*;
import javax.naming.*;
import javax.servlet.*;
import javax.servlet.http.*;

import ear.ejb.stateless.StatelessInterface;
import ear.pojo.Pojo2;		//****************************


public class StatelessServlet extends HttpServlet {

	HttpServletRequest 	request;
	HttpServletResponse response;
	PrintWriter 		out;

	HttpSession 		session;
	StatelessInterface 	proxyStateless;
	String			nombre;

	int compteur = 0;

	static {
		System.out.println("class StatelessServlet loadee");
	}

	public StatelessServlet() {
		super();
		System.out.println("un StatelessServlet cree");
	}

	protected void finalize() throws Throwable {
		System.out.println("un StatelessServlet disparait");
		super.finalize();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("StatelessServlet.compteur=" + (compteur++) );
		System.out.println("StatelessServlet.doGet()");

		request = req;
		response = res;
		response.setContentType("text/html");
		out =response.getWriter();
		connexion();
		out.println("Pojo2.fac(5)=" + Pojo2.fac(5) + "<br/>");		//*********
		out.println("Pojo2.fibo(5)=" + Pojo2.fibo(5) + "<br/>");	//*********
		out.println("depuis l EJB proxyStateless.fac(5)=" + proxyStateless.fac(5) + "<br/>");
		out.println("depuis l EJB proxyStateless.fibo(5)=" + proxyStateless.fibo(5) + "<br/>");
		nombre = request.getParameter("nombre");
		if (nombre!=null) {
			int n = Integer.parseInt(nombre);
			out.println("proxyStateless.incremente("+n+")="+proxyStateless.incremente(n));
		}
		else {
			out.println("proxyStateless.incremente(0)="+proxyStateless.incremente(0));
		}
		afficheFormulaire();
		out.close();
	}
	public void connexion() {

		session = request.getSession(true);
		proxyStateless = (StatelessInterface) session.getAttribute("proxyStateless");			
		if(proxyStateless == null) {
			try {
				Context ctx=new InitialContext();
				proxyStateless =(StatelessInterface) ctx.lookup("enterprise/StatelessSessionBean/local");
				session.setAttribute("proxyStateless", proxyStateless);
			} catch (NamingException ne) {
				out.println(ne.toString());
			}
		}	
		out.println("jsessionid : " + session.getId() + "<br/>");
		out.println("proxyStateless : " + proxyStateless + "<br/>");
	}	
	void afficheFormulaire() {
		out.println("<form method='get' action='"+response.encodeURL("StatelessServlet")+"'>");
		out.println("nombre <input name='nombre' />");
		out.println("<input type='submit' value='submit' />");
		out.println("</form>");
	}	
}
