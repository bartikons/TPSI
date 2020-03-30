package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Person S1 = new Person("1", "11", "jkowalski@wi.zut.edu.pl");
        Person S2 = new Person("2", "10", "jkowalski@wi.zut.edu.pl");
        Person S3 = new Person("3", "9", "jkowalski@wi.zut.edu.pl");
        Person S4 = new Person("4", "8", "jkowalski@wi.zut.edu.pl");
        Person S5 = new Person("5", "7", "jkowalski@wi.zut.edu.pl");
        Person S6 = new Person("6", "6", "jkowalski@wi.zut.edu.pl");
        Person S7 = new Person("7", "5", "jkowalski@wi.zut.edu.pl");
        Person S8 = new Person("8", "4", "jkowalski@wi.zut.edu.pl");
        Person S9 = new Person("9", "3", "jkowalski@wi.zut.edu.pl");
        Person S10 = new Person("0", "2", "jkowalski@wi.zut.edu.pl");
        Person S11 = new Person("10", "1", "jkowalski@wi.zut.edu.pl");
        Person S12 = new Person("11", "0", "jkowalski@wi.zut.edu.pl");
        List<Person> Personlist = new ArrayList<>();
        Personlist.add(S1);
        Personlist.add(S2);
        Personlist.add(S3);
        Personlist.add(S4);
        Personlist.add(S5);
        Personlist.add(S6);
        Personlist.add(S7);
        Personlist.add(S8);
        Personlist.add(S9);
        Personlist.add(S10);
        Personlist.add(S11);
        Personlist.add(S12);

        request.setAttribute("personli", Personlist);
        request.getRequestDispatcher("personList.jsp").forward(request, response);
        
    }

}
