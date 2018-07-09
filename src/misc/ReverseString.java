package misc;
public class ReverseString {

	public ReverseString(String s){
		for(int i =s.length()-1;i>=0;i--){
		System.out.print(s.charAt(i));
		}
	}
}
