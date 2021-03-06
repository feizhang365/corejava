package fei.quartz.demo;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MoveFile2Des implements Job{
	private static final String FILE_DIR = "/Users/fzh/codeHome/cmd";
	private static final String DES_DIR = "/Users/fzh/codeHome/cmd/des";
	private static final String FILE_TEXT_EXT = ".html";
	private ArrayList<File> files = null; 
	final static Logger logger = Logger.getLogger(MoveFile2Des.class);
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		logger.error("xxxxxxxxxxxxxxxxx");
		//get current date string
		Date crtDate = new Date();
		String dateStr = new SimpleDateFormat("YYYY-MM-dd").format(crtDate);
		System.out.println("date========"+dateStr);
		//initialization files arrayList 
		files = new ArrayList<>();
		listFile(FILE_DIR, FILE_TEXT_EXT);
		System.out.println("Files in directory::"+files.size());
		//File Destination
		File fd= new File(DES_DIR+"/"+dateStr);
		if(!fd.exists()){
			fd.mkdir();
		}
		for(File f : files){
			System.out.println("fff==="+f.getAbsolutePath()+"     name:::"+f.getName());
			String destFile = DES_DIR+"/"+dateStr+"/"+f.getName();
			//move file to destination
			f.renameTo(new File(destFile));
			//insert file to DB
			insertFile(f.getName(),destFile);
		}
	}
	
	/**
	 * insert file info
	 * @param fileName
	 * @param filePath
	 */
	private void insertFile(String fileName,String filePath){
		System.out.println(fileName+"====="+filePath);
		Connection conn = null;
		PreparedStatement stmtQ = null;
		PreparedStatement stmtA = null;
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
			String findSql = "select * from fileinfo where name=? and path =?";
			stmtQ = conn.prepareStatement(findSql);
			stmtQ.setString(1, fileName);
			stmtQ.setString(2, filePath);
			ResultSet res = stmtQ.executeQuery();
			while (res.next()) {
				System.out.println("EEEEEEEEEEEEE========"+res.getString(1));
				//throw new Exception("same file exists");
			}
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
			if(stmtQ != null){
				try {
					stmtQ.close();
				} catch (SQLException e) {
					e.printStackTrace();
					stmtQ = null;
				}
			}
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
			System.out.println("conn===="+conn);
		}
	}
	
	/**
	 * get mysql db connection
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	private Connection getConnection() throws ClassNotFoundException, SQLException{
    	//register Mysql driver
		Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://121.43.120.26:3306/jhdataplatform?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull","jhdata01", "jh123!@");
        return conn;
	}
	
	/**
	 * list files with special extension
	 * @param folder
	 * @param ext
	 */
	public void listFile(String folder, String ext) {
		File dir = new File(folder);
		if(dir.isDirectory()==false){
			System.out.println("Directory does not exists : " + FILE_DIR);
			return;
		}
		
		File[] fList = dir.listFiles();
		for(File file : fList){
			if(file.isFile()){
				if(file.getName().endsWith(FILE_TEXT_EXT))
				files.add(file);
			}
			//else if(file.isDirectory()){
			//	listFile(file.getAbsolutePath(),ext);
			//}
		}
		
	}
}
