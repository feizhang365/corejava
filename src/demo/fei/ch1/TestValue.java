package demo.fei.ch1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestValue {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("feizhang");
		p.setAge(33);
		
		p = null;
		System.out.println("person ==="+p);
		
		insertFile("fafaff","/fefefe/adad/");
		
	}
	
	
	
	/**
	 * insert file info
	 * @param fileName
	 * @param filePath
	 */
	public static void insertFile(String fileName,String filePath){
		System.out.println(fileName+"====="+filePath);
		Connection conn = null;
//		PreparedStatement stmtQ = null;
		PreparedStatement stmtA = null;
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
//			String findSql = "select * from fileinfo where name=? and path =?";
//			stmtQ = conn.prepareStatement(findSql);
//			stmtQ.setString(1, fileName);
//			stmtQ.setString(2, filePath);
//			ResultSet res = stmtQ.executeQuery();
//			while (res.next()) {
//				System.out.println("EEEEEEEEEEEEE========"+res.getString(1));
//				throw new Exception("same file exists");
//			}
			//insert
			String addSql = "insert into fileinfo(name,path) values(?,?)";
			stmtA = conn.prepareStatement(addSql);
			stmtA.setString(1, fileName);
			stmtA.setString(2, filePath);
			stmtA.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			if(stmtQ != null){
//				try {
//					stmtQ.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//					stmtQ = null;
//				}
//			}
			if(stmtA != null){
				try {
					stmtA.close();
				} catch (SQLException e) {
					e.printStackTrace();
					stmtA = null;
				}
			}
			
			if(conn != null){
				try {
					conn.close();
					conn = null;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.println("conn===="+conn.toString());
		}
	}
	
	/**
	 * get mysql db connection
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
    	//register Mysql driver
		Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://121.43.120.26:3306/jhdataplatform?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull","jhdata01", "jh123!@");
        return conn;
	}
	

}


class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

