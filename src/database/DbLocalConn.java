/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ng'ang'a Victor
 */
public class DbLocalConn {

    Connection connection = null;

    public static Connection dbLocalConnect() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:pos.sqlite");
            return connection;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection error: " + e);
            e.printStackTrace();
            return null;
        }
    }
}
