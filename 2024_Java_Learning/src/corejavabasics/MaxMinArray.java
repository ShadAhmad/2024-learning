package corejavabasics;
import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.print("Enter " + n + " numbers: ");
		for(int i=0; i<n; ++i)
			arr[i] = sc.nextInt();
		sc.close();
		
		//int max = arr[0], min = arr[0];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		for(int i=0; i<n; ++i) {
			if(arr[i] > max)	max = arr[i];
			if(arr[i] < min)	min = arr[i];
		}

		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}
}