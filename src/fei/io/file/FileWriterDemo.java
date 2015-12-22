package fei.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * append to file
 * @author fzh
 *
 */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		String str = "";
		//read input
		Scanner sc = new Scanner(System.in);
		File file = new File("javaio_appendfile.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		while(sc.hasNext()){
			str = sc.nextLine();
			if(":wq".equals(str)){
				str = "";
				sc.close();
				break;
			}else{
				// append to file with FileWriter
				FileWriter fw = new FileWriter(file,true);
				fw.write(str);
				fw.flush();
				fw.close();
			}
		}

	}
}
