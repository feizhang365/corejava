package fei.quartz.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
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
