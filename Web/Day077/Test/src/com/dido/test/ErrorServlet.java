package com.dido.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ErrorServlet")
public class ErrorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ErrorServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strNum1 = request.getParameter("num1");
        String strNum2 = request.getParameter("num2");

        int num1 = 0, num2 = 0;
        try {
            num1 = Integer.parseInt(strNum1);
            num2 = Integer.parseInt(strNum2);
        }catch(NumberFormatException e) {
            response.sendError(510, "정수를 입력하지 않은 오류!");
            return;
        }
        //나눗셈을 위해 정수 형태로 변환한다.

        int result = 0;//결과를 저장할 공간

        response.setContentType("text/html;charset=utf-8");
        //응답을 위한 MIME과 문자 셋 설정
        PrintWriter out = response.getWriter();

        try {
            result = num1 / num2;
        }catch(ArithmeticException e) {
            response.sendError(511, "부적합 연산 관련 오류!");
            return;
        }

        out.println("<!doctype html>");
        out.println("<html><body>");
        out.println(num1 + " / " + num2 + " = " + result);
        out.println("</body></html>");
        out.close();
    }
}