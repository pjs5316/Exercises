package sort;

import java.util.Arrays;

public class MergeSort {
	
	public MergeSort(int [] a){
		sort(a);
	}

	private static void sort(int[] a){

		//iterate until down to 1 index
		if(a.length <= 1){return;}
		//first half
		int[] first = new int[a.length/2];
		//second half
		int[] second = new int[a.length-first.length];
		//copy first half of passed array into first array
		for(int i =0;i<first.length;i++){
			first[i] = a[i];
		}
		System.out.println("first pre sort"+Arrays.toString(first));
		//copy first second of passed array into second array
		for(int i =0;i<second.length;i++){
			second[i]=a[first.length+i];
		}
		System.out.println("second pre sort"+Arrays.toString(second));
		//use recursion to pass first half
		sort(first);
		System.out.println("first after recursion"+Arrays.toString(first));
		sort(second);
		System.out.println("second after recursion"+Arrays.toString(second));
		merge(first, second, a);
	}
	private static void merge (int[] low, int[] hi,int[] a) {
		int iFirst = 0, iSecond = 0, j = 0; //iFirst index at first array, second at second array, j remaining in a
		System.out.println("Using merge: first half: "+Arrays.toString(low)+" second half: "+Arrays.toString(hi));
		//this is the first while loop, both iFirst and iSecond are at 0 to start, 
		//which ever condition is met will determine which half will increment it's index, 
		//this will repeat until one of the two index markers are as long as the corresponding array that is passed 
		while (iFirst<low.length && iSecond<hi.length){
			if(low[iFirst]<hi[iSecond]){
				System.out.println("low[iFirst]<hi[iSecond]");
				a[j]=low[iFirst];
				System.out.println("low[iFirst] "+low[iFirst]);
				iFirst++;
			}
			else{
				System.out.println("low[iFirst]>hi[iSecond]");
				a[j]=hi[iSecond];
				System.out.println("hi[iSecond] "+hi[iSecond]);
				iSecond++;
			}// value at array a will come from either first or second half, then either iFirst or iSecond will increment
			j++;
				
		}
		//one of the two will be called depending on which index was incremented to meet previous while loop, 
		//the remaining (previously sorted) index will continue to populate array a that is passed
		while (iFirst<low.length){
			System.out.println("First catch with iFirst<low.length "+low[iFirst]);
			a[j]=low[iFirst];
			iFirst++;j++;
		}
		while(iSecond<hi.length){
			System.out.println("Second catch with iSecond<hi.length "+hi[iSecond]);
			a[j]=hi[iSecond];
			iSecond++;j++;
		}
		System.out.println("value of j "+j);
	}
	

	public void test(){
		int[] a = new int[] {10, 4, 5, 12, 40, 1, 3, 16, 11};
		System.out.println(Arrays.toString(a));
		MergeSort.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
