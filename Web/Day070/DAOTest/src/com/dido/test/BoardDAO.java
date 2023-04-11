package com.dido.test;

import java.sql.*;
import java.util.ArrayList;

public class BoardDAO {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    private String user = "root";
    private String password = "1234";

    public BoardDAO() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<BoardDTO> selectBoard() {
        String SQL = "SELECT no, title, name, date, views FROM board ORDER BY no DESC";
        ArrayList<BoardDTO> list = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(url, user, password);
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
}
