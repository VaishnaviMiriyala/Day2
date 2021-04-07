package m2.task2;
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        String arr[] = new String[num];
        for(int i = 0;i < num;i++) {
        	arr[i] = sc.nextLine();
        }
        sc.close();
        sc1.close();
        String arr1[] = new String[num];
        Exercise2 obj= new Exercise2();
        arr1 = obj.sortStrings(arr);
        for(int i = 0;i < arr1.length;i++) {
        	System.out.print(arr1[i]+" ");
        }
	}
	public String[] sortStrings(String arr[]) {
		String temp;
		for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { 
                if (arr[i].compareTo(arr[j]) > 0) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		for(int i = 0;i < arr.length;i++) {
			if(arr[i].length() % 2 == 0) {
			  temp = arr[i].substring(0,arr[i].length()/2).toUpperCase();
			  temp += arr[i].substring(arr[i].length()/2,arr[i].length()).toLowerCase();
			  arr[i] = temp;
			}else {
			  temp = arr[i].substring(0,((int)arr[i].length()/2)+1).toUpperCase();
			  temp += arr[i].substring(((int)arr[i].length()/2+1),arr[i].length()).toLowerCase();
			  arr[i] = temp;
			}
		}
		return arr;
		
	}

}
