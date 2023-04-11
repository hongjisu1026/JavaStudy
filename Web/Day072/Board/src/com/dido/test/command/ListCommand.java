package com.dido.test.command;

import com.dido.test.dao.BoardDAO;
import com.dido.test.dto.BoardDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ListCommand implements Command {
    @Override
    public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BoardDAO dao = BoardDAO.getBoardDAO();
        ArrayList<BoardDTO> list = dao.listDAO();
        request.setAttribute("list", list);
    }
}
