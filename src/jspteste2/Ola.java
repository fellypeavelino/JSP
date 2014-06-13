package jspteste2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Ola
 */
@WebServlet("/Ola")
public class Ola extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ola() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome"); 
		String sobrenome = request.getParameter("sobrenome"); 
		//response.setContentType("text/html"); 
		//PrintWriter out = response.getWriter(); 
		//out.println("Bem Vindo<h3>"+nome+" " +sobrenome+"</h3>"); out.close();
		/* header(Locaton)*/
		RequestDispatcher rd = request.getRequestDispatcher("destino.jsp");
		request.setAttribute("nome",nome);//lança variavel
		HttpSession session = request.getSession(); //session_start()
		//session.invalidate(); session_destroy()
		ServletContext application = getServletContext();// outra forma session_start()
		application.setAttribute("nomeGlobal", "variavel global");
		session.setAttribute("SESSION", "session initiation");
	    rd.forward(request, response);
	    //request.getContextPath() path
	    //response.sendRedirect("home.jsp"); outra maneira de redirecionar paginas
	}

}
