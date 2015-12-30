package fei.quartz.demo;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnManager {

	private static ThreadLocal<Connection> connHolder = new ThreadLocal<Connection>();
	/**
	 * get Connection 
	 * @return
	 */
	public static Connection getConnection(){
		Connection conn = connHolder.get();
		if(conn == null){
			try {
				//get connection 
				conn = DBUtils.getConnection();
				//set connection to threadLocal
				connHolder.set(conn);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	/**
	 * begin connection 
	 * @param conn
	 */
	public static void beginConnection(Connection conn){
		try {
			if(conn !=null){
				if(conn.getAutoCommit()){
					conn.setAutoCommit(false);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * commit connection
	 * @param conn
	 */
	public static void commitConnection(Connection conn){
		try {
			if(conn !=null){
				if(!conn.getAutoCommit()){
					conn.commit();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * close connection
	 * @param conn
	 */
	public static void closeConnection(){
		try {
			Connection conn = connHolder.get();
			if (conn != null){		// in transaction if conn in threadlocal
				conn.close();
				conn = null;
				connHolder.remove();
			}
			System.out.println(connHolder.get());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	
	
}
