package provaJava;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewSalesman")
public class ViewSalesman extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<a href='addSalesman.html'>Adicionar Novo Vendedor</a>");
        out.println("<h1>Lista de Vendedores</h1>");
        
        List<salesman> list = generalDAO.getAllSalesmans();
        
        out.print("<table border='1' width='100%'");
        out.print("<tr><th>Id</th><th>Nome</th><th>Cidade</th><th>Comissão</th><th>Editar</th><th>Excluir</th></tr>");
        for(salesman e:list)
        {
            out.print("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td> "+e.getCity()+" </td><td> "+e.getCommission()+" </td><td><a href = 'EditSalesman?salesman_id="+e.getId()+"'> Editar </a></td><td><a href = 'DeleteSalesman?salesman_id="+e.getId()+"'> Excluir </a></td></tr> ");
        }
        out.print("</table>");
        
        out.close();
    }
}


//Douglas willian CB3005348
//João Vitor Gino CB3005488