/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUltilities;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ttay2
 */
public class DBUltilities {

    public static Connection loadDb() {
        Connection con;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            /* often not required for Java 6 and later (JDBC 4.x) */
            con = DriverManager.getConnection("jdbc:ucanaccess://calc.accdb", "", "");
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
