package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Ejemplo Servlet</h1>");
		out.println(getContent(request));
		out.println("</body></html>");
	}

	private String getContent(HttpServletRequest eRequest) {
		StringBuilder str = new StringBuilder();
		str.append("<form action='").append(eRequest.getContextPath()).append("/myServlet2' method='Post'>").
		append("<label for='fname'>Nombres:</label><br>").
		append("<input type='text' id='fname' name='fname' placeholder='Ingresar Nombres' value=''><br>").
		append("<label for='lname'>Apellidos:</label><br>").
		append("<input type='text' id='lname' name='lname' placeholder='Ingresar Apellidos' value=''><br><br>").
		append("<input class='btn' type='submit' value='Enviar'>").
		append("</form>");
		return str.toString();
	}

}