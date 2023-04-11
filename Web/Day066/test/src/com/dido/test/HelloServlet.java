package com.dido.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", value = "/HelloServlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();

        out.print("<!doctype>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Hi</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>HelloServlet</h1>");
        out.print("</body>");
        out.print("</html>");
    }
}
