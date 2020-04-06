package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Session", urlPatterns = {"/Session"})
public class Session extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        int temp = 0;
        if (session.isNew()) {
            session.setAttribute("licznik", temp);
        } else {
            if (Objects.isNull(session.getAttribute("licznik"))) {
                
            session.setAttribute("licznik", 0);
            }
            temp = (Integer) session.getAttribute("licznik");
            session.setAttribute("licznik", temp + 1);
        }
        request.getRequestDispatcher("licznik.jsp").forward(request, response);

    }

}
