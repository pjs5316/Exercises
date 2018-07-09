package sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
	public SelectionSort(int [] arr){
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public int minPos(int[] a, int b){
		int minimPos=b;
		for(int i=b+1;i<a.length;i++){
			if(a[i]<a[minimPos])
			{
				System.out.println("a[i] "+a[i]);
				minimPos = i;
				}
		}
		System.out.println(minimPos);
		return minimPos;
	}
	public void swap(int[] a, int minPos, int index){
		int temp = a[index];
		a[index]= a[minPos];
		a[minPos]=temp;
	}
	
	public void sort(int[] a){
		System.out.println("Initial Array: "+Arrays.toString(a));
		for (int i =0;i<a.length;i++){
			int min  = minPos(a, i);
			swap(a, min, i);
			System.out.println(Arrays.toString(a));
		}
	}
	
}

