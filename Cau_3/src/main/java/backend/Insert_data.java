package backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * this class is
 * 
 * @author AnhSon
 */
public class Insert_data {
	public static void add()
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {

		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resource/database.properties"));

		// 1.setup library

		// 2.get connection database
		String url = properties.getProperty("url");
		String usename = properties.getProperty("usename");
		String password = properties.getProperty("password");

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, usename, password);

		System.out.println("Connect Success!");

		java.sql.Statement statement = connection.createStatement();

		// 4.Execute SQL query
		String sql = "INSERT INTO users\r\n" + "value 	(4,'Nguyen Anh Son',2500),(5,'Nguyen Phuong Thao',3000),\r\n"
				+ "		(6,'Nguyen Anh Thu',4000)";

		// 5.Handling result set
		int i = statement.executeUpdate(sql);

		System.out.println("effectedRecordAmount:" + i);

		connection.close();
	}
}
