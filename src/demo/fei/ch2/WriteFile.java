package demo.fei.ch2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw = null;
		try {
			System.out.println("=======");
			fw = new FileWriter("FileWriteTest.txt");
			fw.write("fafeafeafefaf");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fw.close();
		}
		
	}

}
