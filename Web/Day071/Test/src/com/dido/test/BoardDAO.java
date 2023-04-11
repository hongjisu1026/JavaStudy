package com.dido.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;

public class BoardDAO {
    private DataSource dataSource;

    public BoardDAO() {
        try {
            Context context = new InitialContext();
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<BoardDTO> selectBoard() {
        String SQL = "SELECT no, title, name, date, views FROM board ORDER BY no DESC";
        ArrayList<BoardDTO> list = new ArrayList<>();

        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SQL);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                BoardDTO dto = new BoardDTO();
                dto.setNo(rs.getInt("no"));
                dto.setTitle(rs.getString("title"));
                dto.setName(rs.getString("name"));
                dto.setDate(rs.getString("date"));
                dto.setViews(rs.getInt("views"));
                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public int insertBoard(BoardDTO dto) {
        String SQL = "INSERT INTO board (title, name, content, password) values (?, ?, ?, ?)";
        int result = 0;

        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, dto.getTitle());
            pstmt.setString(2, dto.getName());
            pstmt.setString(3, dto.getContent());
            pstmt.setString(4, dto.getPassword());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
