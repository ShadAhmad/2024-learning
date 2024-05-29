package corejavabasics;
import java.util.Arrays;
import java.util.Scanner;

public class LinearBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.print("Enter " + n + " numbers: ");
		for(int i=0; i<n; ++i)
			arr[i] = sc.nextInt();
		
		System.out.print("Enter the number to search: ");
		int search = sc.nextInt();
		sc.close();
		
		int i = 0;
		while(arr[i] != search && i<n)
			++i;
		
		if(i == n)
			System.out.println("Not Found");
		else
			System.out.println("Number found at position: " + (i+1));
		
		Arrays.sort(arr);
		System.out.println("Size of array is: " + arr.length);
		System.out.print("Sorted Array: ");
		for(int j=0; j<n; ++j)
			System.out.print(arr[j] + " ");
		System.out.println();
		
		int beg = 0, end = n-1, mid = (beg + end) / 2;
		
		while(arr[mid] != search && beg <= end) {
			if(arr[mid] > search)	end = mid;
			else beg = mid;
			mid = (beg + end) / 2;
		}
		
		if(beg > end)
			System.out.println("Not Found");
		else
			System.out.println("Number found at position: " + (mid+1));
	}
}