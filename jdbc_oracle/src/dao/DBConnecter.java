package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {
   public static Connection getConnection() {
      Connection conn = null;
      
      try {
         String userName = "hr";
         String userPassword = "1111";
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
      
         //드라이버 로드
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         //커넥션 객체를 드라이버 매니저를 통해 얻어온다
         conn = DriverManager.getConnection(url, userName, userPassword);
         
         System.out.println("연결성공!");
      }catch(ClassNotFoundException e) {
         System.out.println("드라이버 연결실패!!");
         e.printStackTrace();
      }catch(SQLException e) {
         System.out.println("연결실패!!");
         e.printStackTrace();
      }catch(Exception e) {
         System.out.println("알수없는 오류!");
         e.printStackTrace();
      }
      return conn;
   }
}









