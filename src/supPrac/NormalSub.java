package supPrac;

public class NormalSub extends NormalSuper{
	
	private Integer tested;
	
	public NormalSub(String test, int tested) {
		super(test);
		this.tested = tested;	
		System.out.println(test+" is "+tested);
	}
	
	public void print(){
		System.out.println(this.test+" is "+tested);
	}

	public Integer getTested() {
		return tested;
	}

	public void setTested(Integer tested) {
		this.tested = tested;
	}
	
	
}
