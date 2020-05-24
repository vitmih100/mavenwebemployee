package controller;

import dao.EmployeeDb;
import domain.Employee;
import enums.Gender;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "UpdateEmployee", urlPatterns = {"/update-employee"})
public class UpdateEmployee extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateEmployee</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateEmployee at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EmployeeDb employeeDb = new EmployeeDb();
        HttpSession session = request.getSession();
        session.setAttribute("contactById", employeeDb.get(request.getParameter("id"), 1));
        response.sendRedirect("update.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        EmployeeDb employeeDb = new EmployeeDb();
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String salary = request.getParameter("salary");
        String hireday = request.getParameter("hireday");
        String birthday = request.getParameter("birthday");
        String genderStr = request.getParameter("gender");
        Gender gender;
        try {
            gender = Gender.valueOfIgnoreCase(genderStr);
        } catch (IllegalArgumentException e) {
            gender = Gender.valueOf(genderStr);
        }
        Employee employee = new Employee(Integer.parseInt(id),name,surname,Double.parseDouble(salary),LocalDate.parse(hireday,formatter),LocalDate.parse(birthday,formatter),gender);
        employeeDb.update(employee);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
