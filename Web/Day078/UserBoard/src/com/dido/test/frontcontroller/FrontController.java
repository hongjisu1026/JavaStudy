package com.dido.test.frontcontroller;

import com.dido.test.command.Command;
import com.dido.test.command.RegisterOKCommand;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public FrontController() {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        doAction(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        doAction(request, response);
    }

    public void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String commandName = request.getServletPath();
        String viewPage = null;
        Command command = null;

        switch (commandName) {
            case "/register.do":
                viewPage = "register.jsp";
            case "/registerOK.do":
                command = new RegisterOKCommand();
                command.excute(request, response);
                viewPage = "index.jsp";
                break;
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
        dispatcher.forward(request,response);
    }
 }
