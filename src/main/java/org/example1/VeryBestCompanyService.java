package org.example1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VeryBestCompanyService implements BestCompanyService {

    Connection connection;

    public VeryBestCompanyService(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<String> getAllDB() throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeQuery("SELECT datname FROM pg_database;");
        ResultSet resultSet = statement.getResultSet();
        List<String> listNameDB = new ArrayList<>();
        while (resultSet.next()){
            listNameDB.add(resultSet.getString("datname"));
        }
        return listNameDB;

    }

}
