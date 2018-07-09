package misc;

import java.io.*;
//import java.lang.reflect.Array;
import java.util.*;

public class DiagonalSumDiff {
	public DiagonalSumDiff()
	{
		String[] args = new String[]{"test"};
		aClass(args);
	}

    public static void aClass(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[] sampleArr = new int[10];
        sampleArr[0] = 9;
        String[] test = new String[]{"9"};
        System.out.println(Integer.parseInt(test[0]));
        Random rand = new Random();
		for (int i = 1; i < sampleArr.length; i++) {
			sampleArr[i] = rand.nextInt(9) + 1;
			System.out.println(sampleArr[i]);
		}
       
    	int n = (int) Math.sqrt(Double.parseDouble(test[0]));
        int place = 0;
        int rowIndex = 0;
        int [][] matrix = new int [3][3];
        
        int primSum = 0;
        int secSum = 0;
        
        int primPlace = 0;
        int secPlace = 2;
        
        
        for(int[] row: matrix){
            for (int i = 0; i < row.length; i++){          	
            	place++;
                matrix[rowIndex][i] = sampleArr[place];  
                System.out.println("Value at "+rowIndex+" and "+i+" :"+matrix[rowIndex][i]);
                
            }
            primSum = primSum + matrix[rowIndex][rowIndex];
            System.out.println("primSum: "+primSum);
            secSum = secSum + matrix[rowIndex][secPlace];
            System.out.println("secSum: "+secSum);
            rowIndex++;
            secPlace--;
        }
        
        System.out.println("difference: "+java.lang.Math.abs(primSum - secSum));
        
        }
    
}