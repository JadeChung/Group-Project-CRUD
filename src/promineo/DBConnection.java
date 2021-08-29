package promineo;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
//Author Jade 
	public class DBConnection {
		private final static String URL = "jdbc:mysql://localhost:3306/Elementary_db";
		private final static String USERNAME = "root";
		private final static String PASSWORD = "#Irregularshit1";
		public static Connection connection;
		public static DBConnection instance;

		private DBConnection(Connection connection) {
			DBConnection.connection = connection;
		}

		public static Connection getConnection() {
			if (instance == null) {
				try {
					connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
					instance = new DBConnection(connection);
					System.out.println("Connection successful.");
				} catch (SQLException e) {
					System.out.println("Unsucessful connection.");
					e.printStackTrace();

				}
			}

			return DBConnection.connection;
		}

	}

