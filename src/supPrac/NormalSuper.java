package supPrac;

public class NormalSuper {
	
	protected String test;
	
	
	public NormalSuper(String test) {
		this.test = test;
	}
	
	public String output(){
		return "test";
	}
	
	public void print(){
		System.out.println(this.output());
	}
	
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

}
