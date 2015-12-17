package fei.io.file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WriteFile {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter pw = new PrintWriter("file1.txt", "UTF-8");
		pw.write("测试 line 1");
		pw.write("测试 line 2");
		pw.close();
	}

}
