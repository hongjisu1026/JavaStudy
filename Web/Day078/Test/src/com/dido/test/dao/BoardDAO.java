package com.dido.test.dao;

import com.dido.test.dto.BoardDTO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO {
    private static BoardDAO boardDAO = new BoardDAO();
    private final String TABLE_NAME = "mvcboard";
    private DataSource dataSource;

    private BoardDAO() {
        try {
            Context context = new InitialContext();
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/test");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public static BoardDAO getBoardDAO() {
        return boardDAO;
    }

    public BoardDTO getBoardDTO(int no) {
        final String SQL = "SELECT * FROM " + TABLE_NAME + " WHERE no = " + no;
        BoardDTO dto = new BoardDTO();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SQL);
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                dto.setNum(rs.getInt("no"));
                dto.setName(rs.getString("name"));
                dto.setTitle(rs.getString("title"));
                dto.setContents(rs.getString("contents"));
                dto.setHit(rs.getInt("hit"));
                dto.setWtime(rs.getString("wtime"));
                dto.setGroupNum(rs.getInt("groupNum"));
                dto.setStepNum(rs.getInt("stepNum"));
                dto.setIndentNum(rs.getInt("indentNum"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public void increaseHit(int no) {
        final String SQL = "UPDATE " + TABLE_NAME + " SET hit = hit+1 WHERE no = " + no;
        int result = 0;
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void writeOKDAO(BoardDTO dto) {
        final String SQL = "INSERT INTO " + TABLE_NAME + " (groupnum, name, title, contents) values ((SELECT maxno from ((SELECT IFNULL(MAX(no) + 1, 1) as maxno FROM " + TABLE_NAME + ")) as mvc), ?, ?, ?)";
        int result = 0;
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getTitle());
            pstmt.setString(3, dto.getContents());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modifyOK(BoardDTO dto) {
        final String SQL = "UPDATE " + TABLE_NAME + " SET name = ?, title = ?, contents = ?, wtime = now() WHERE no = ?";
        int result = 0;
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getTitle());
            pstmt.setString(3, dto.getContents());
            pstmt.setInt(4, dto.getNum());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStepNum(BoardDTO dto) {
        final String SQL = "UPDATE " + TABLE_NAME + " SET stepnum = stepnum+1 WHERE groupnum = ? AND stepnum >= ?";
        int result = 0;
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setInt(1, dto.getGroupNum());
            pstmt.setInt(2, dto.getStepNum() + 1);
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public BoardDTO replyDAO(int no) {
        return getBoardDTO(no);
    }

    public void replyOKDAO(BoardDTO dto) {
        final String SQL = "INSERT INTO " + TABLE_NAME + " (name, title, contents, groupnum, stepnum, indentnum) values (?, ?, ?, ?, ?, ?)";
        updateStepNum(dto);
        int result = 0;
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getTitle());
            pstmt.setString(3, dto.getContents());
            pstmt.setInt(4, dto.getGroupNum());
            pstmt.setInt(5, dto.getStepNum());
            pstmt.setInt(6, dto.getIndentNum());

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteDAO(int no) {
        final String SQL = "DELETE FROM " + TABLE_NAME + " WHERE no = ?";
        int result = 0;
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setInt(1, no);

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<BoardDTO> listDAO() {
        ArrayList<BoardDTO> list = new ArrayList<>();
        final String SQL = "SELECT * FROM " + TABLE_NAME + " ORDER BY groupnum DESC, stepnum ASC";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SQL);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                BoardDTO dto = new BoardDTO();
                dto.setNum(rs.getInt("no"));
                dto.setName(rs.getString("name"));
                dto.setTitle(rs.getString("title"));
                dto.setContents(rs.getString("contents"));
                dto.setHit(rs.getInt("hit"));
                dto.setWtime(rs.getString("wtime"));
                dto.setGroupNum(rs.getInt("groupNum"));
                dto.setStepNum(rs.getInt("stepNum"));
                dto.setIndentNum(rs.getInt("indentNum"));
                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public BoardDTO viewDAO(int no) {
        increaseHit(no);
        return getBoardDTO(no);
    }
}
