
package Servlets;

import Operaciones.setData;
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
            String id = request.getParameter("id");
            String names = request.getParameter("names");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String cellphone = request.getParameter("cellphone");
            String send = request.getParameter("send");
            String refresh = request.getParameter("refresh");

            if ( send != null ){
               /* out.print("<p> <Strong>ID Cliente=  "+Id_Cliente);
                out.print("<p> <Strong>Nombres=  "+Nombres);
                out.print("<p> <Strong>Direccion=  "+Direccion);
                out.print("<p> <Strong>Telefojo Fijo=  "+Telefono_Fijo);
                out.print("<p> <Strong> Celular=   "+Celular);
                request.setAttribute("id",id);
                request.setAttribute("nombres",names);
                request.setAttribute("dirección",address);
                request.setAttribute("télefono",phone);
                request.setAttribute("celular",cellphone);
                request.setAttribute("enviar",send);
                request.setAttribute("actualizar",refresh);*/
                if( setData.set( new setData(id,names,address,phone,cellphone) ) )
                {
                    request.getRequestDispatcher("/webApplication/index.jsp").forward( request, response );
                }
                              }
            if ( refresh != null ){
            }
    }
    catch(Exception e){}

    }
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
