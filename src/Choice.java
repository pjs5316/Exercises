import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import collections.CollectionArrayList;
import OOP.Overload;
import misc.DiagonalSumDiff;
import misc.Fibonacci;
import misc.PlusMinus;
import misc.ReverseString;
import search.BinarySearch;
import sort.MergeSort;
import sort.QuickSort;
import sort.SelectionSort;
import supPrac.SubInter;

public class Choice {

	public Choice() {
		decision();
	}

	/**
	 * method returns choice
	 */
	public int present() {
		int choice;
		System.out.println("Please select choice: " + "\n1: OO Principles: 1"
				+ "\n2: SearchClasses: 2" + "\n3: SortClasses: 3"
				+ "\n4: Misc: 4" +"\n5: Collections: 5");

		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		return choice;
	}

	public void decision() {
		int choice = present();
		System.out.println(choice);
		boolean flag = true;
		switch (choice) {
		case 1:
			System.out.println("OOP");
			OOP();
			break;
		case 2:
			searchClasses();
			flag = false;
			break;

		case 3:
			sortClasses();
			break;
		case 4:
			miscClasses();
			break;
		case 5:
			collect();
			break;
		default:
			System.out
					.println("Incorrect choice, please choose from available choices!");
			this.decision();
			break;
		}

	}

	private void collect() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose collections class:" + "\n1 : ArrayList: 1");

		choice = sc.nextInt();

		switch (choice) {
		case 1:
			CollectionArrayList ca = new CollectionArrayList();
			break;
		default:
			System.out
					.println("Incorrect choice, please choose from available choices!");
			this.decision();
			break;
		}
	}
	private void OOP() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose OOP class:" + "\n1 : Overload: 1"+"\n2 : Inheritance 2");

		choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("No Params: new Overload();");
			Overload overload = new Overload();
			System.out.println("Params: new Overload(\"What's Up\");");
			Overload overload2 = new Overload("What's up");
			break;
		case 2:
			inherit();
		default:
			System.out
					.println("Incorrect choice, please choose from available choices!");
			this.decision();
			break;

		}

	}
	private void inherit() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose inherit class:" + "\n1 : Interface: 1"+"\n2 : Abstract Super 2\n3 : Normal Super 3");

		choice = sc.nextInt();

		switch (choice) {
		case 1:
			SubInter subInter = new SubInter();
		case 2:
			inherit();
		default:
			System.out
					.println("Incorrect choice, please choose from available choices!");
			this.decision();
			break;

		}
	}

	public void searchClasses() {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		System.out.println("Creating  array: " + Arrays.toString(a));
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose search class:" + "\n1 : BinarySearch: 1");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out
					.println("Enter value to find, if out of array, will return -1");
			choice = sc.nextInt();
			BinarySearch binarySearch = new BinarySearch(a, choice);
			break;
		default:
			System.out
					.println("Incorrect choice, please choose from available choices!");
			this.decision();
			break;

		}
	}

	private void miscClasses() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose misc class:" + "\n1 : DiagonalSumDiff: 1"
				+ "\n2 : Fibonacci: 2" + "\n3 : ReverseString: 3"
				+ "\n4 : PlusMinus: 4");

		choice = sc.nextInt();

		switch (choice) {
		case 1:
			DiagonalSumDiff D = new DiagonalSumDiff();
			break;
		case 2:
			Fibonacci fibonacci = new Fibonacci();
			System.out.println("the answer: " + fibonacci.sequence());
			break;
		case 3:
			System.out.println("Enter String: ");
			String text = sc.next();
			ReverseString reverseString = new ReverseString(text);
			break;
		case 4:
			PlusMinus plusMinus = new PlusMinus();
			break;
		default:
			System.out
					.println("Incorrect choice, please choose from available choices!");
			this.decision();
			break;

		}

	}

	private void sortClasses() {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = 1 + (int) (Math.random() * ((10 - 1) + 1));
		}
		System.out.println("Creating random array: " + Arrays.toString(a));
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose sort class:" + "\n1 : MergeSort: 1"
				+ "\n2 : SelectionSort: 2" + "\n3 : QuickSort: 3");

		choice = sc.nextInt();

		switch (choice) {
		case 1:
			MergeSort mergerSort = new MergeSort(a);
			break;
		case 2:
			SelectionSort selectionSort = new SelectionSort(a);
			break;
		case 3:
			QuickSort quickSort = new QuickSort(a);
		default:
			System.out
					.println("Incorrect choice, please choose from available choices!");
			this.decision();
			break;

		}

	}
}
