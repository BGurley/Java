/* Brandon Gurley
 * 4/24/2023
 * CSC 258
 * Merge Sort Algorithm Program
 * Time Taken: 1.5 Hours
 */




public class MergeSort {

	// Merges two sub arrays, L and M, into an array
	void merge(int array[], int p, int q, int r)
	{
		int n1 = q - p + 1;
		int n2 = r - q;
		
		int L[] = new int[n1];
		int M[] = new int[n2];
		
		// Fills Left and Right array
		for (int i = 0; i < n1; i++)
			L[i] = array[p + i];
		for (int j = 0; j < n2; j++)
			M[j] = array[q+1+j];
		
		// Maintains current index of the arrays
		int i, j, k;
		i = 0;
		j = 0;
		k = p;
		
		// Picks Larger elements in L and M and places them in the correct position
		while (i < n1 && j < n2)
		{
			if (L[i] <= M[j])
			{
				array[k] = L[i];
				i++;
			}
			else
			{
				array[k] = M[j];
				j++;
			}
			k++;
		}
		
		// When there are no more elements in L M, puts remaining in Array
		while (i < n1)
		{
			array[k] = L[i];
			i++;
			k++;
		}
		
		while (j < n2)
		{
			array[k] = M[j];
			j++;
			k++;	
		}
	}
	
	// Divides array into two sub arrays, then sorts and merges the subarrays
	void mergeSort(int array[], int left, int right)
	{
		if (left < right)
		{
			// Point where array is divided
			int mid = (left+right)/2;
			
			// Recusrive Call to Subarrays
			mergeSort(array, left, mid);
			mergeSort(array, mid+1, right);
			
			// Merges Sorted Sub Arrays
			merge(array, left, mid, right);
		}
	}
	
	// Method to Print the Array
	void printArray(int array[])
	{
		int n = array.length;
		for (int i=0; i<n; ++i)
			System.out.print(array[i]+ " ");
		System.out.println();
		
	}
	
	// Main Method
	public static void main(String args[])
	{
		// Unsorted Array
		int[] array = {23, 46, 32, 11, 76, 4};
		
		MergeSort ms = new MergeSort();
		
		System.out.println("Array BEFORE Merge Sort: ");
		ms.printArray(array);
		System.out.println();
		
		// Calls merge sort method with array, first index, and last index
		ms.mergeSort(array,  0, array.length-1);
		
		System.out.println("Array AFTER Merge Sort: ");
		ms.printArray(array);
	}
}
