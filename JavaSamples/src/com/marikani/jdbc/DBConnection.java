package com.marikani.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Properties props = new Properties();
            FileInputStream fileInputStream = new FileInputStream("C:\\source\\tutorials\\JavaSamples\\src\\db.properties");
            props.load(fileInputStream);
            Class.forName(props.getProperty("db_driver_class"));
            con = DriverManager.getConnection(props.getProperty("db_url"), props.getProperty("db_username"), props.getProperty("db_password"));
            System.out.println("connection established " + con);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public static void main(String[] args) {
        DBConnection.getConnection();
    }
}
