package com.dido.test.frontcontroller;

import com.dido.test.command.Command;
import com.dido.test.command.ListCommand;
import com.dido.test.command.WriteOKCommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    public FrontController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAction(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAction(request, response);
    }

    public void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String commandName = request.getServletPath();
        String viewPage = null;
        Command command = null;

        if (commandName.equals("/list.do")) {
            command = new ListCommand();
            command.excute(request, response);
            viewPage = "list.jsp";
        } else if (commandName.equals("/write.do")) {
            viewPage = "write.jsp";
        } else if (commandName.equals("/writeOK.do")) {
            command = new WriteOKCommand();
            command.excute(request, response);
            viewPage = "list.do";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
        dispatcher.forward(request, response);
    }
}
