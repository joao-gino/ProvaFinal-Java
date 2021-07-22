package provaJava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditCustomer")
public class EditCustomer extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Atualizar Cliente</h1>");
        String sid = request.getParameter("customer_id");
        int id = Integer.parseInt(sid);

        customer e = generalDAO.getCustomerById(id);

        out.print("<form action='EditCustomer2' method='post'>");
        out.print("<table>");
        out.print("<tr><td></td><td><input type='hidden' name='customer_id' value='"+ e.getId()+"'/></td></tr>");
        out.print("<tr><td>Nome:</td><td><input type='text' name='cust_name' value= '"+e.getCustName()+"' /></ td ></ tr > ");
        out.print("<tr><td>Cidade:</td><td><input type='text' name='city' value='"+e.getCity()+"'/></td></tr>");
        out.print("<tr><td>Avaliação:</td><td><input type='text' name='grade' value= '"+e.getGrade()+"' /></ td ></ tr > ");
        out.print("<tr><td>Vendedor:</td><td><input type='text' name='salesman_id' value= '"+e.getSalesmanId()+"' /></ td ></ tr > ");
        out.print("<tr><td colspan='2'><input type='submit' value='Editar e Salvar'/></td></tr>");
        out.print("</table>");
        out.print("</form>");

        out.close();
    }
}


//Douglas willian CB3005348
//João Vitor Gino CB3005488