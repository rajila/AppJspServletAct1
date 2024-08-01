package ejemplos.servlet.curso;

import ejemplos.clases.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Usuario usuario = GetUser(request);
		request.setAttribute("usuario", usuario);

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Bienvenido "+ usuario +" &#128546; &#128546; &#128546;!!</h1>");
	}

	@Override
	protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		//super.doPost(httpServletRequest, httpServletResponse);

		Usuario usuario = GetUser(httpServletRequest);
		httpServletRequest.setAttribute("usuario", usuario);

		httpServletResponse.setContentType("text/html");
		PrintWriter out = httpServletResponse.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Bienvenido "+ usuario + " &#128526; &#128526; &#128526; !!</h1>");
	}

	private Usuario GetUser(HttpServletRequest eRequest) {
		String nameIn = eRequest.getParameter("fname") != null ? eRequest.getParameter("fname") : "";
		String lastNameIn = eRequest.getParameter("lname") != null ? eRequest.getParameter("lname") : "";

		if (nameIn.isEmpty()) nameIn = "xxx";
		if (lastNameIn.isEmpty()) lastNameIn = "xxx";

		return new Usuario(nameIn, lastNameIn);
	}
}