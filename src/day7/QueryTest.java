package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;




public class QueryTest {
	public static void main(String[] args) {
		testDelete();
	}
	public static void testQuery(){
		try (Connection connection = DriverManager.getConnection(TestSQL.url,TestSQL.username,TestSQL.password)) {
			if (!connection.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			else {
				System.out.println("error");
			}
			String sqlString = "select * from account where id = ? or first_name = ? ";
			PreparedStatement statement = connection.prepareStatement(sqlString);
			connection.setAutoCommit(false);
			
			statement.setString(1, "1");
			statement.setString(2, "Jane");
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString(1) + '\t');
				System.out.println(rs.getString(2) + '\t');
				System.out.println(rs.getString(3) + '\t');
				System.out.println(rs.getString(4) + '\t');
				System.out.println(rs.getString(5) + '\t');
				System.out.println();

			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public static void testUpdate(){
		try (Connection connection = DriverManager.getConnection(TestSQL.url,TestSQL.username,TestSQL.password)) {
			if (!connection.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			else {
				System.out.println("error");
			}
			String sqlString = "update employee set firstname = ? where id = ? ";
			PreparedStatement statement = connection.prepareStatement(sqlString);
			
			statement.setString(1, "Jone123");
			statement.setString(2, "1");
			int row = statement.executeUpdate();
			
			System.out.println(row + "change");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public static void testInsert(){
		try (Connection connection = DriverManager.getConnection(TestSQL.url,TestSQL.username,TestSQL.password)) {
			if (!connection.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			else {
				System.out.println("error");
			}
			String sqlString = "insert into account values('7','test','hello','world',12004)";
			PreparedStatement statement = connection.prepareStatement(sqlString);
			
			int row = statement.executeUpdate();
			
			System.out.println(row + "change");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public static void testJoin(){
		try (Connection connection = DriverManager.getConnection(TestSQL.url,TestSQL.username,TestSQL.password)) {
			if (!connection.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			else {
				System.out.println("error");
			}
			String sqlString = "SELECT employee.id ,firstname,lastname, e_mail "
					+ "from employee left join account on last_name = lastname";
			PreparedStatement statement = connection.prepareStatement(sqlString);
			
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("id") + '\t');
				System.out.println(rs.getString("firstname") + '\t');
				System.out.println(rs.getString(3) + '\t');
				System.out.println(rs.getString(4) + '\t');
				System.out.println();

			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public static void testDelete(){
		try (Connection connection = DriverManager.getConnection(TestSQL.url,TestSQL.username,TestSQL.password)) {
			if (!connection.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			else {
				System.out.println("error");
			}
			String sqlString = "delete from account where id = '7'";
			PreparedStatement statement = connection.prepareStatement(sqlString);
			
			int row = statement.executeUpdate();
			
			System.out.println(row + "change");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
}
