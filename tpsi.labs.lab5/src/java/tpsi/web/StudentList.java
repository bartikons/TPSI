package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "StudentList", urlPatterns = {"/StudentList"})
public class StudentList extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        if (Objects.isNull(session.getAttribute("Lista_studentow"))) {
            List<Student> Studentlist = new ArrayList<>();
            session.setAttribute("Lista_studentow", Studentlist);
            request.getRequestDispatcher("studentList.jsp").forward(request, response);
        }

        List<Student> Studentlist = (List<Student>) session.getAttribute("Lista_studentow");
        Student temp = new Student(request.getParameter("imie"), request.getParameter("nazwisko"), request.getParameter("email"), request.getParameter("id"));
        Studentlist.add(temp);
        session.setAttribute("Lista_studentow", Studentlist);
        request.getRequestDispatcher("studentList.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        if (Objects.isNull(session.getAttribute("Lista_studentow"))) {
            List<Student> Studentlist = new ArrayList<>();
            session.setAttribute("Lista_studentow", Studentlist);
        }
        List<Student> Studentlist = (List<Student>) session.getAttribute("Lista_studentow");
        session.setAttribute("Lista_studentow", Studentlist);
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("studentList.jsp").forward(request, response);

    }
}
