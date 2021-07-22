package provaJava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteOrder")
public class DeleteOrder extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        String sid = request.getParameter("ord_no");
        int id = Integer.parseInt(sid);
        generalDAO.deleteOrder(id);
        response.sendRedirect("ViewOrder");
    }
}


//Douglas willian CB3005348
//João Vitor Gino CB3005488