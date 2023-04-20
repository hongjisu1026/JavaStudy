package com.dido.test.command;

import com.dido.test.dao.BoardDAO;
import com.dido.test.dto.BoardDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ReplyOKCommand implements Command {
    @Override
    public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BoardDAO dao = BoardDAO.getBoardDAO();
        BoardDTO dto = new BoardDTO();
        dto.setName(request.getParameter("name"));
        dto.setTitle(request.getParameter("title"));
        dto.setContents(request.getParameter("contents"));
        dto.setNum(Integer.parseInt(request.getParameter("num")));
        dto.setGroupNum(Integer.parseInt(request.getParameter("groupNum")));
        dto.setStepNum(Integer.parseInt(request.getParameter("stepNum")));
        dto.setIndentNum(Integer.parseInt(request.getParameter("indentNum")));
        dao.replyOKDAO(dto);
    }
}
