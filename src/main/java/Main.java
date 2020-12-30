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
//        Properties properties = new Properties("org.postgresql.Driver","jdbc:postgresql://localhost:5432/customers",
//                "root","root");
//
//        JdbcUtils jdbcUtils = new JdbcUtils();
//
//        Connection connection = jdbcUtils.getConnection(properties);
//
//        BestCompanyService bestCompanyService = new VeryBestCompanyService(connection);
//        System.out.println(bestCompanyService.getAllDB());
//
//    }
//
//
//}
