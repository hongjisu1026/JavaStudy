package com.dido.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WriteOK", value = "/WriteOK")
public class WriteOK extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        BoardDTO dto = new BoardDTO();
        BoardDAO dao = new BoardDAO();

        String title = request.getParameter("title");
        String name = request.getParameter("name");
        String content = request.getParameter("content");
        String password = request.getParameter("password");

        dto.setTitle(title);
        dto.setName(name);
        dto.setContent(content);
        dto.setPassword(password);

        int result = dao.insertBoard(dto);
        if (result == 1) {
            response.sendRedirect("list.jsp");
        }
    }
}
