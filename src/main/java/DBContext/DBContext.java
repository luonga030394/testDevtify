package DBContext;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {

	private final String url = "jdbc:postgresql://localhost:5432/DataDevtify";
	private final String userName = "postgres";
	private final String password = "nhinhi1109";

	public Connection getConnection() {
		Connection cnt = null;
		try {
			Class.forName ("org.postgresql.Driver");
			cnt = DriverManager.getConnection(url, userName, password);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return cnt;
	}

	
}
