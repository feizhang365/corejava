package demo.fei.java;

public class SortArrDemo {
	public static void main(String[] args) {
		int[] data = {3,100,9,8,7};
		int low = 0,high = data.length-1;
		while(low < high){
			int temp = data[low];
			data[low++] = data[high];
			data[high--] = temp;
		}
		
		for(int i=0; i< data.length;i++){
			System.out.println(data[i]);
		}
	}
}
