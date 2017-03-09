package com.kcs.auto.adverts.service.impl;

import com.kcs.auto.adverts.service.ConnectionService;
import com.sun.istack.internal.Nullable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by andriusbaltrunas on 3/9/2017.
 */
public class ConnectionServiceImpl implements ConnectionService {

    private static final String URL = "jdbc:mysql://localhost:3306/auto_adverts";
    private static final String NAME = "root";
    private static final String PASSWORD = "MySQL";
    private static final String DRIVER_CALSS = "com.mysql.jdbc.Driver";

    @Nullable
    @Override
    public Connection createConnection() {
        setJdbcClassDriver();
        Connection connection = null;
        try {
             connection = DriverManager.getConnection(URL, NAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    private void setJdbcClassDriver(){
        try {
            Class.forName(DRIVER_CALSS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
