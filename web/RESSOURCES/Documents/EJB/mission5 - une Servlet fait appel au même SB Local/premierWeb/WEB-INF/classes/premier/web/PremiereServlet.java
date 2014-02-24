package premier.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.PrintWriter;
import premier.ejb.Premier;

public class PremiereServlet extends HttpServlet {

	int compteur = 0;

	static {
		System.out.println("class PremiereServlet loadee");
	}

	public PremiereServlet() {
		super();
		System.out.println("une PremiereServlet cree");
	}

	protected void finalize() throws Throwable {
		System.out.println("une PremiereServlet disparait");
		super.finalize();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("PremiereServlet.compteur=" + (compteur++) );
		System.out.println("PremiereServlet.doGet()");
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		try {
			Context ctx=new InitialContext();
			Premier prem=(Premier) ctx.lookup("PremierEJB/local");
			out.println("fac(5)=" + prem.fac(5)	+ "<br/>");
			out.println("fibo(5)=" + prem.fibo(5)	+ "<br/>");
			out.println("incremente()=" + prem.incremente()	+ "<br/>");
			out.println("incremente()=" + prem.incremente()	+ "<br/>");
			out.println("incremente()=" + prem.incremente()	+ "<br/>");
		} catch (NamingException ne) {
			out.println(ne.toString());
		} 
		out.close();
	}
}
