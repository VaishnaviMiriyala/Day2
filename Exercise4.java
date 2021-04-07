package m2.task2;
import java.util.*;
public class Exercise4 {
       int size;
	public static void main(String[] args) {
		System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0;i < num;i++) {
        	arr[i] = sc.nextInt();
        }
        sc.close();
        Exercise4 obj= new Exercise4();
        int temp[] = new int[num];
        temp = obj.modifyArray(arr);
        for(int i = 0;i < obj.size;i++) {
              System.out.print(temp[i]+" ");
        }
	}
	int count = 0;
	public int[] modifyArray(int arr[]) {
		int arr1[] = new int[arr.length];
		for(int i = 0;i < arr.length;i++) {
			for(int j = i+1;j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					arr[i] = -1;
				}
			}
		}
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] != -1) {
				arr1[count++] = arr[i];
			}
		}
		size = count;
		for(int i = 0;i < size;i++) {
			for(int j = i+1;j < size;j++) {
				if(arr1[i] < arr1[j]) {
					arr1[i] = arr1[i] + arr1[j];
					arr1[j] = arr1[i] - arr1[j];
					arr1[i] = arr1[i] - arr1[j];
				}
			}
		}
		return arr1;
	}

}
