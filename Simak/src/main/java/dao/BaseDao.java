package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author AERO
 */
public class BaseDao {

    private static String DB_NAME = "simak";
    private static String DB_HOST = "localhost";
    private static String DB_USER = "root";
    private static String DB_PASS = "";

    public static Connection getCon() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + DB_HOST + ":8111/" + DB_NAME, DB_USER, DB_PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void closeCon(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
