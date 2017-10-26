package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSQL {

	public static final String url = "jdbc:mysql://localhost:3307/activity";
	public static final String username = "root";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String password = "abcd1234";

	public static void main(String[] args) {

		try {
			Class.forName(name);
			Connection myConnection = DriverManager.getConnection(url,
					username, password);
			if (!myConnection.isClosed())
				System.out.println("Succeeded connecting to the Database!");

			// statement用来执行SQL语句
			Statement statement = myConnection.createStatement();

			// 要执行的SQL语句
			String sql = "select * from account";

			// 结果集
			ResultSet rs = statement.executeQuery(sql);

			System.out.println("-----------------");
			System.out.println("执行结果如下所示:");

			String name = null;

			while (rs.next()) {

				// 选择sname这列数据
				System.out.println(rs.getString(1) + '\t');
				System.out.println(rs.getString(2) + '\t');
				System.out.println(rs.getString(3) + '\t');
				System.out.println(rs.getString(4) + '\t');
				System.out.println();

			}

			rs.close();
			myConnection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
