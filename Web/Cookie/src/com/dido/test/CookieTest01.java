package com.dido.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieTest01", value = "/CookieTest01")
public class CookieTest01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>title</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<form method=\"post\" action=\"CookieTest02\"");
        out.print("<label for=\"id\">아이디</label>");
        out.print("<input type=\"text\" id=\"name\">");
        out.print("<br><br>");
        out.print("<label for=\"pwd\">비밀번호</label>");
        out.print("<input type=\"password\" id=\"pwd\">");
        out.print("<br><br>");
        out.print("<input type=\"checkbox\" name=\"rememberId\" value=\"remember\">아이디 기억하기");
        out.print("<br><br>");
        out.print("<input type=\"submit\" value=\"로그인\"");
        out.print("</form>");
        out.print("</body>");
        out.print("</html>");
    }
}
