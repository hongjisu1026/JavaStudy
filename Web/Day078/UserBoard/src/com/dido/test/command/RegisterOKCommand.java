package com.dido.test.command;

import com.dido.test.dao.UserDAO;
import com.dido.test.dto.UserDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterOKCommand implements Command {
    @Override
    public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        UserDAO dao = UserDAO.getUserDAO();
        UserDTO dto = new UserDTO();

        dto.setName(request.getParameter("name"));
        dto.setUsername(request.getParameter("id"));
        dto.setNickname(request.getParameter("nickname"));
        dto.setPassword(request.getParameter("password"));
        dto.setEmail(request.getParameter("email"));
        dto.setPostCode(request.getParameter("postcode"));
        dto.setRoadAddress(request.getParameter("roadAddress"));
        dto.setJibunAddress(request.getParameter("jibunAddress"));
        dto.setDetailAddress(request.getParameter("detailAddress"));
        dto.setExtraAddress(request.getParameter("extraAddress"));
        String birth = request.getParameter("year") + request.getParameter("month") + request.getParameter("date");
        dto.setBirth(birth);
        dto.setPhone(request.getParameter("phone"));
        dto.setSex(request.getParameter("sex"));

        int result = dao.registerOK(dto);
    }
}
