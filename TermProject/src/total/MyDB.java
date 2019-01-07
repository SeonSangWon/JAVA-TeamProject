package total;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDB {
	
	public static Connection getCon() {
		Connection con = null;
		try {
			//JDBC Driver 메모리에 Load (Driver 객체 생성)
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/movie?charaterEncoding=utf-8";
			String userId = "yuhan";
			String pwd = "yuhan1234";
			con = DriverManager.getConnection(url, userId, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
