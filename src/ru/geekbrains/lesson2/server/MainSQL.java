package ru.geekbrains.lesson2.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainSQL {

    private static Connection connection;
    private static Statement stmt;

    private static void createTable() throws SQLException {
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS student (\n" +
                "            id    INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "            name  TEXT,\n" +
                "            score INTEGER)" );
    }

    private static void updateUsers() throws SQLException {
        stmt.executeUpdate("INSERT INTO user (name, score) VALUES (?, ?);");
        stmt.executeUpdate("UPDATE student set score = ? where id = ?;");

    }

    public static void UsersListConnect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:geekbrainsDB.db");
        stmt = connection.createStatement();
    }

    public static void UsersListDisconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
