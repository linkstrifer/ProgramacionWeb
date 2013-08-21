
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


public class Servlet_Servicios extends HttpServlet {
   
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet_Servicios</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet_Servicios at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        } finally { 
            //out.close();
        }
    } 

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

  
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);

        PrintWriter out = response.getWriter();

        try{
            String Id_Cliente=request.getParameter("Id_Cliente");
            String Nombres=request.getParameter("Nombres");
            String Direccion=request.getParameter("Direccion");
            String Telefono_Fijo=request.getParameter("Telefono_Fijo");
            String Celular=request.getParameter("Celular");
            String Enviar=request.getParameter("Enviar");
            String Actualizar=request.getParameter("Actualizar");

            if (Enviar!=null){
               /* out.print("<p> <Strong>ID Cliente=  "+Id_Cliente);
                out.print("<p> <Strong>Nombres=  "+Nombres);
                out.print("<p> <Strong>Direccion=  "+Direccion);
                out.print("<p> <Strong>Telefojo Fijo=  "+Telefono_Fijo);
                out.print("<p> <Strong> Celular=   "+Celular);*/

                request.setAttribute("Id_Cliente",Id_Cliente);
                request.setAttribute("Nombres",Nombres);
                request.setAttribute("Direccion",Direccion);
                request.setAttribute("Telefono_Fijo",Telefono_Fijo);
                request.setAttribute("Celular",Celular);
                request.setAttribute("Enviar",Enviar);
                request.setAttribute("Actualizar",Actualizar);
                              }
            if (Actualizar!=null){
            out.println("<strong>USTED PRESIONO EL BOTON ACTUALIZAR");
            }
    }
    catch(Exception e){}

    }
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
