package lang.core.interfaces;

public interface BaseInterface {
	
	public default void printline() {
		System.out.println("interface BaseInterface printline");
	}
	
	static BaseInterface of(double p1) {
		return new BaseImpl1(p1);
	}
	

}
