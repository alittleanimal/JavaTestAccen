package day7.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestSql {

	private static final String url = "jdbc:mysql://localhost:3307/testdb";
	private static final String username = "root";
	private static final String name = "com.mysql.jdbc.Driver";
	private static final String password = "abcd1234";

	public static void main(String[] args) {
		try {
			Class.forName(name);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SelectAll();
		InsertInto();
		UpdateSql();
		DeleteSql();
		LeftJoin();
	}

	public static void SelectAll() {
		try (Connection connection = DriverManager.getConnection(url, username,
				password)) {
			if (!connection.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			System.out.println("Select All ---------------");
			
			String sqlStringa = "select * from table_a";
			PreparedStatement statement = connection
					.prepareStatement(sqlStringa);
			ResultSet rs = statement.executeQuery();
			System.out.println("Select from table a: ");
			while (rs.next()) {
				System.out.print(rs.getString(1) + '\t');
				System.out.print(rs.getString(2) + '\t');
				System.out.println();
			}
			System.out.println();

			String sqlStringb = "select * from table_b";
			PreparedStatement statementb = connection
					.prepareStatement(sqlStringb);
			ResultSet rsb = statementb.executeQuery();
			System.out.println("Select from table b: ");
			while (rsb.next()) {
				System.out.print(rsb.getString(1) + '\t');
				System.out.print(rsb.getString(2) + '\t');
				System.out.println();
			}
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void InsertInto() {
		try (Connection connection = DriverManager.getConnection(url, username,
				password)) {
			if (!connection.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			else {
				System.out.println("error");
			}
			System.out.println("Insert Into ---------------");

			String sqlString = "insert into table_b values('s3','Zhongwei')";
			PreparedStatement statement = connection
					.prepareStatement(sqlString);

			int row = statement.executeUpdate();
			System.out.println(row + "changed");

			String select = "select * from table_b";
			PreparedStatement statement1 = connection.prepareStatement(select);
			ResultSet rs = statement1.executeQuery();
			System.out.println("Select from table_b: ");
			while (rs.next()) {
				System.out.print(rs.getString(1) + '\t');
				System.out.print(rs.getString(2) + '\t');
				System.out.println();
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	public static void UpdateSql() {
		try (Connection connection = DriverManager.getConnection(url, username,
				password)) {
			if (!connection.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			else {
				System.out.println("error");
			}
			System.out.println("Update sql ---------------");
			
			String sqlString = "update table_b set name = ? where id = ? ";
			PreparedStatement statement = connection
					.prepareStatement(sqlString);
			statement.setString(1, "accenture");
			statement.setString(2, "s3");

			int row = statement.executeUpdate();
			System.out.println(row + "change");
			System.out.println();

			String select = "select * from table_b";
			PreparedStatement statement1 = connection.prepareStatement(select);
			ResultSet rs = statement1.executeQuery();
			System.out.println("Select from table_b: ");
			while (rs.next()) {
				System.out.print(rs.getString(1) + '\t');
				System.out.print(rs.getString(2) + '\t');
				System.out.println();
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	public static void DeleteSql() {
		try (Connection connection = DriverManager.getConnection(url, username,
				password)) {
			if (!connection.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			else {
				System.out.println("error");
			}
			System.out.println("Delete Sql ---------------");
			
			String sqlString = "delete from table_b where id = 's3'";
			PreparedStatement statement = connection
					.prepareStatement(sqlString);

			int row = statement.executeUpdate();
			System.out.println(row + "change");
			System.out.println();

			String select = "select * from table_b";
			PreparedStatement statement1 = connection.prepareStatement(select);
			ResultSet rs = statement1.executeQuery();
			System.out.println("Select from table_b: ");
			while (rs.next()) {
				System.out.print(rs.getString(1) + '\t');
				System.out.print(rs.getString(2) + '\t');
				System.out.println();
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	private static void LeftJoin() {
		try (Connection connection = DriverManager.getConnection(url, username,
				password)) {
			if (!connection.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			else {
				System.out.println("error");
			}
			System.out.println("Left Join ---------------");

			String sqlString = "SELECT * from table_a left join table_b on code = id";
			PreparedStatement statement = connection
					.prepareStatement(sqlString);

			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString(1) + '\t');
				System.out.print(rs.getString(2) + '\t');
				System.out.print(rs.getString(3) + '\t');
				System.out.print(rs.getString(4) + '\t');
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
