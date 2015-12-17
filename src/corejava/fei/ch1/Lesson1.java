package corejava.fei.ch1;

import java.util.Scanner;

public class Lesson1 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String rl = sc.next();
		if(!"Q".equals(rl)){
			System.out.println(rl);
		}else{
			System.exit(0);
		}
	}
}
