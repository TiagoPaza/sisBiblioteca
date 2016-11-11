/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.com.uricer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author -Tiago
 */
public class DB {
    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Livros", "usuario", "senha");
        return conn;
    }
}
