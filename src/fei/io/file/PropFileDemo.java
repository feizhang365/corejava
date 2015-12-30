package fei.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropFileDemo {
	public static void main(String[] args) {
		PropFile propFile = PropFile.getInstance();
		try {
			Properties prop = propFile.getProperties("test.properties");
			String name = prop.getProperty("name");
			System.out.println("========"+name);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


class PropFile{
	private static  PropFile propFile = null;

	private PropFile(){
	}
	
	public static PropFile getInstance(){
		if(propFile ==null){
			propFile = new PropFile();
		}
		return  propFile ;
	}
	/**
	 * get File Properties
	 * @param path
	 * @return
	 * @throws FileNotFoundException 
	 */
	public Properties getProperties(String path) throws FileNotFoundException{
		File file = new File(path);
		InputStream ins = new FileInputStream(file);
		Properties prop = new Properties();
		try {
			prop.load(new InputStreamReader(ins,"UTF-8"));
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ins.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return prop;
	}
	
}