// Program: Selection Sort
// Written by: Brandon Gurley
// Program Description: Sorts an Array via selection sort in O(n^2) time
// File name: SelectionSort.java

import java.io.*;

public class SelectionSort 
{
	void sort(int arr[])
	{
		int n  =arr.length;
		
		for (int i = 0; i < n-1; i++)
		{
			int min = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min])
					min = j;
			
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;	
		}
	}	
		void printArray(int arr[])
		{
			int n = arr.length;
			for (int i=0; i<n; ++i)
				System.out.print(arr[i]+" ");
			
			System.out.println();
		}
	
		public static void main(String args[])
		{
			SelectionSort ss = new SelectionSort();
			int arr[] = {64,25,12,22,11};
			ss.sort(arr);
			System.out.println("Sorted Array");
			ss.printArray(arr);
		}
}