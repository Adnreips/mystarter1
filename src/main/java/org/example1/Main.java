//package org.example1;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//
///*private String jdbcDriver = "org.postgresql.Driver";
//    private String url = "jdbc:postgresql://localhost:5432/customers";
//    private String user = "root";
//    private String password = "root";
//*/
//public class Main {
//
//    public static void main(String[] args) throws SQLException {
//        org.example1.Properties properties = new org.example1.Properties("org.postgresql.Driver","jdbc:postgresql://localhost:5432/customers",
//                "root","admin1982");
//
//        org.example1.JdbcUtils jdbcUtils = new org.example1.JdbcUtils();
//
//        Connection connection = jdbcUtils.getConnection(properties);
//
//        org.example1.BestCompanyService bestCompanyService = new org.example1.VeryBestCompanyService(connection);
//        System.out.println(bestCompanyService.getAllDB());
//
//    }
//
//
//}
