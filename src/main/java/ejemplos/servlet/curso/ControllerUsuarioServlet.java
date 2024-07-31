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

@WebServlet(urlPatterns = "/ControllerUsuarioServlet")
public class ControllerUsuarioServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        //super.doPost(httpServletRequest, httpServletResponse);
        /*httpServletResponse.setContentType("text/html");
        PrintWriter out = httpServletResponse.getWriter();

        String name = httpServletRequest.getParameter("fname");

        // send HTML page to client
        out.println("<html>");
        out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Controller Usuario: "+ name +"</h1>");
        out.println("</body></html>");*/

        // Get data Request
        String nameIn = httpServletRequest.getParameter("fname");
        String lastNameIn = httpServletRequest.getParameter("lname");

        if (nameIn.isEmpty()) nameIn = "xxx";
        if (lastNameIn.isEmpty()) lastNameIn = "xxx";

        Usuario usuario = new Usuario(nameIn, lastNameIn);
        httpServletRequest.setAttribute("usuario", usuario);
        httpServletRequest.setAttribute("test", "Ronald");

        RequestDispatcher _redirect = httpServletRequest.getRequestDispatcher("views/users/WelcomeUsuario.jsp");
        _redirect.forward(httpServletRequest, httpServletResponse);
    }
}
