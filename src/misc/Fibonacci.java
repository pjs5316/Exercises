package misc;
public class Fibonacci {

	public int sequence(){
		int x=1;
		int y=0;
		int sum = 0;
		while(x<1000){
			System.out.println("step 1: x= "+(y+x));
			x=y+x;
			System.out.println("step 2: y= "+(x-y));
			y=x-y;
			sum=sum+x;
			
		}
		System.out.println("Sum: "+sum);
		return x;
	}
}
