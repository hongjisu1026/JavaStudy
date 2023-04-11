package com.dido.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Input", value = "/Input")
public class Input extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();

        out.print("<!doctype>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Input</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<form method='post' action='ResultInput'>");
        out.print("<table border='1'>");
        out.print("<tr>");
        out.print("<td><label for='name'>이름</label></td>");
        out.print("<td><input type='text' name='name' id='name'></td>");
        out.print("</tr>");
        out.print("<td><label for='id'>아이디</label></td>");
        out.print("<td><input type='text' name='id' id='id'></td>");
        out.print("</tr>");
        out.print("<td><label for='pwd'>비밀번호</label></td>");
        out.print("<td><input type='password' name='pwd' id='pwd'></td>");
        out.print("</tr>");
        out.print("<td><label for='hobby'>취미</label></td>");
        out.print("<td>");
        out.print("<input type='checkbox' name='hobby' id='reading' value='독서'>");
        out.print("<input type='checkbox' name='hobby' id='cooking' value='요리'>");
        out.print("<input type='checkbox' name='hobby' id='running' value='조깅'>");
        out.print("<input type='checkbox' name='hobby' id='swimming' value='수영'>");
        out.print("<input type='checkbox' name='hobby' id='sleeping' value='취침'>");
        out.print("</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>전공</td>");
        out.print("<td>");
        out.print("<input type='radio' name='major' id='kor' value='국어'>");
        out.print("<input type='radio' name='major' id='eng' value='영어'>");
        out.print("<input type='radio' name='major' id='math' value='수학'>");
        out.print("<input type='radio' name='major' id='design' value='디자인'>");
        out.print("</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>프로토콜</td>");
        out.print("<td>");
        out.print("<select name='protocol' id='protocol'>");
        out.print("<option value='http'>http</option>");
        out.print("<option value='http'>ftp</option>");
        out.print("<option value='http'>smtp</option>");
        out.print("<option value='http'>pop</option>");
        out.print("</select>");
        out.print("</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td colspan='2'>");
        out.print("<input type='submit' value='전송'>");
        out.print("<input type='reset' value='초기화'>");
        out.print("</td>");
        out.print("</tr>");
        out.print("</table>");

    }
}
