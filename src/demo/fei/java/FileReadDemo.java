package demo.fei.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new FileReader("master.txt"));
		String lineContent;
		while((lineContent =bReader.readLine()) != null){
			System.out.println(lineContent);
		}
		bReader.close();
	}

}
