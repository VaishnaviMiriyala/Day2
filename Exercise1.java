package m2.task2;
import java.util.Scanner;
import java.util.Arrays; 
public class Exercise1 {

	public static void main(String[] args) {
		System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0;i < num;i++) {
        	arr[i] = sc.nextInt();
        }
        sc.close();
        Exercise1 obj= new Exercise1();
        System.out.println("The second smallest number is: " +obj.getSecondSmallest(arr));
	}
	public int getSecondSmallest(int arr[]) {
		Arrays.sort(arr);
		return arr[1];
	}
	
}