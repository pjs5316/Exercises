package sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	public QuickSort(int[] a){
		sort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public void sort(int[] arr, int from, int to){
		System.out.println("passing into sort: "+Arrays.toString(arr));
		if (from>=to){return;}
		int p = partition(arr, from, to);
		System.out.println("first sort");
		sort(arr, from, p);
		System.out.println("second sort");
		sort(arr, p+1, to);
	}
	
	public int partition(int[] arr, int from, int to){
		System.out.println("partitioning: "+from+" to "+to);
		int pivot = arr[from];
		System.out.println("pivot: "+pivot);
		int i = from-1;
		int j = to+1;
		System.out.println("pre while: i: "+i+" and j: "+j);
		
		while(i<j){
			System.out.println("going through while iteration: ");
			i++; while (arr[i] < pivot) { i++; System.out.println("i++ :"+i);}
			j--; while (arr[j] > pivot) { j--; System.out.println("j-- :"+j);}
			System.out.println("i: index:"+i+" value "+arr[i]+" and j: index "+j+" value "+arr[j]);
			if (i < j) { swap(arr, i, j); }
		}
		System.out.println("returning: "+j);
		return j;
	}
	public void swap(int[] a, int x, int y){
		int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
	}
}
