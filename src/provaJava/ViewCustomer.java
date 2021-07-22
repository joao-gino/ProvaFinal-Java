package provaJava;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewCustomer")
public class ViewCustomer extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<a href='addCustomer.html'>Adicionar novo Cliente</a>");
        out.println("<h1>Clientes</h1>");
        
        List<customer> list = generalDAO.getAllCustomers();
        
        out.print("<table border='1' width='100%'");
        out.print("<tr><th>Id</th><th>Nome</th><th>Cidade</th><th>Avaliação</th><th>Vendedor</th><th>Editar</th><th>Excluir</th></tr>");
        for(customer e:list)
        {
            out.print("<tr><td>" + e.getId() + "</td><td>" + e.getCustName() + "</td><td> "+e.getCity()+" </td><td> "+e.getGrade()+" </td><td> "+e.getSalesmanId()+" </td><td><a href = 'EditCustomer?customer_id="+e.getId()+"'> Editar </a></td><td><a href = 'DeleteCustomer?customer_id="+e.getId()+"'> Excluir </a></td></tr> ");
        }
        out.print("</table>");
        
        out.close();
    }
}


//Douglas willian CB3005348
//João Vitor Gino CB3005488