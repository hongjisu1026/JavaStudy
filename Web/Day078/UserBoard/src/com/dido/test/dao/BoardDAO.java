package com.dido.test.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDAO {
    private static BoardDAO boardDAO = new BoardDAO();
    private final String TABLE_NAME = "mvcboard";
    private DataSource dataSource;
    private BoardDAO() {
        try {
            Context context = new InitialContext();

        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
