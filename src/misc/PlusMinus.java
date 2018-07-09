package misc;
import java.util.*;


public class PlusMinus {
	public PlusMinus(){
		this.aClass();
	}

	public void aClass() throws NumberFormatException{
		Scanner in = new Scanner(System.in);
		
		int pos = 0;
		int neg = 0;
		int zero = 0;
		
		try {
			while (in.hasNext()){			
				int x = in.nextInt();
				if (x == 0){
					zero++;
				}
				else if (x <= 0){
					neg++;
				}
				else if (x >= 0){
					pos++;
				}
			}
		} catch (Exception e) {
			System.out.println("exit");
		}
		System.out.println("pos: "+pos);
		System.out.println("neg: "+neg);
		System.out.println("zero: "+zero);
	}
}
