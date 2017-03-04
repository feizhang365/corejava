package demo.fei.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
	/**
	 * get Scanner
	 * @return
	 */
	public static Scanner getScanner(){
		Scanner scanner = new Scanner(System.in);
		return scanner;
	}

	/**
	 * 返回输入整数
	 * @param scanner
	 * @return
	 */
	public static int getInt(Scanner scanner){
		int num = scanner.nextInt();
		return num;
	}
	
	/**
	 * 冒泡排序
	 * @param array
	 */
	public static void bubbleSort(int array[]){
		int temp;//交换的中间变量
		int count=0;//进行循环的次数
		boolean flag=false;//标志变量，如果数组有序了则flag为true不在进行循环了
		
		for(int i=0;i<array.length-1 && !flag;i++){
			flag = true;
			for(int j=0;j<array.length-i-1;j++){
				count++;
				if(array[j]>array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag=false;
				}
			}
		}
		System.out.println("count:"+count+";"+Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		int[] arr = {9,19,7,5,222,32};
		bubbleSort(arr);
		

	}

}
