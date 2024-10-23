

package Modelo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/svLogin")
public class svLogin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String contrasena = request.getParameter("contrasena");

        // Simulación de validación de usuario
        if ("admin".equals(nombre) && "admin".equals(contrasena)) {
            response.sendRedirect("Vistas/formAdmin.jsp"); // Redirigir al formulario de admin
        } else if ("cliente".equals(nombre) && "cliente".equals(contrasena) ) {
            response.sendRedirect("Vistas/formCliente.jsp"); // Redirigir al formulario de cliente
        } else {
            response.sendRedirect("Vistas/ErrorCredenciales.jsp"); // Redirigir a página de error
        }
    }
}
