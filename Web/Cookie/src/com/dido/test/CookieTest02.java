package com.dido.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieTest02", value = "/CookieTest02")
public class CookieTest02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        Cookie cookie = null;

        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        String check = request.getParameter("rememberId");

        if (check.equals("remember")) {
            cookie = new Cookie("id", "hong");
            cookie.setMaxAge(365*24*60*60);
            response.addCookie(cookie);
        } else {
            
        }
    }
}
