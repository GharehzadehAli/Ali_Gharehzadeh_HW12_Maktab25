package ir.maktab;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Sum extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        switch (getServletConfig().getInitParameter("operation")) {

            case "+":
                out.println("the addition is " + (num1 + num2));
                break;
            case "*":
                out.println("the multiplication is " + (num1 * num2));
                break;
            case "-":
                out.println("the subtraction is " + (num1 - num2));
                break;

            case "/":
                out.println("the division is " + (num1 / num2));
                break;
            default:
                System.out.println("hey");
        }
    }
}
