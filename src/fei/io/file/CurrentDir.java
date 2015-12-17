package fei.io.file;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentDir {

	public static void main(String[] args) {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		System.out.println("Current relative path is: " + s);
		
		// get current file path
		String p = new File("").getAbsolutePath();
		System.out.println(p);
		File f = new File("/Users/fzh/github");
		File[] files = f.listFiles();
		for(File file : files){
			System.out.println(file.getName());
		}
//		System.out.println(files);
	}

}
