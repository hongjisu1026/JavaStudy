package com.dido.test.dao;

import com.dido.test.dto.BoardDTO;
import com.dido.test.dto.UserDTO;
import org.apache.catalina.User;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    private static UserDAO userDAO = new UserDAO();
    private final String TABLE_NAME = "user";
    private DataSource dataSource;

    private UserDAO() {
        try {
            Context context = new InitialContext();
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/user_board");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public static UserDAO getUserDAO() {
        return userDAO;
    }

    public int registerOK(UserDTO dto) {
        String SQL = "INSERT INTO " + TABLE_NAME + " (name, username, nickname, password, email, postCode, roadAddress, jibunAddress, detailAddress, extraAddress, birth, phone, sex) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int result = 0;
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1,dto.getName());
            pstmt.setString(2, dto.getUsername());
            pstmt.setString(3, dto.getNickname());
            pstmt.setString(4, dto.getPassword());
            pstmt.setString(5, dto.getEmail());
            pstmt.setString(6, dto.getPostCode());
            pstmt.setString(7, dto.getRoadAddress());
            pstmt.setString(8, dto.getJibunAddress());
            pstmt.setString(9, dto.getDetailAddress());
            pstmt.setString(10, dto.getExtraAddress());
            pstmt.setString(11, dto.getBirth());
            pstmt.setString(12, dto.getPhone());
            pstmt.setString(13, dto.getSex());

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public void loginOK(UserDTO dto) {
        String SQL = "SELECT * FROM " + TABLE_NAME + " WHERE username = ?";
        try (Connection conn = dataSource.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
