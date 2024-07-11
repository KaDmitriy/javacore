package lang.core.interfaces;

public interface BaseInterface {
	
	static BaseInterface of(double p1) {
		return new BaseImpl1(p1);
	}
	

}
