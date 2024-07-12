package lang.core.interfaces;

import java.util.Objects;

public class BaseImpl1 implements BaseInterface, BaseInterface2 {

	private double p1;

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public BaseImpl1(double p1) {
		super();
		this.p1 = p1;
	}  
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(p1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseImpl1 other = (BaseImpl1) obj;
		return Double.doubleToLongBits(p1) == Double.doubleToLongBits(other.p1);
	}

	@Override
	public void printline() {
		// TODO Auto-generated method stub
		BaseInterface.super.printline();
	}	

}
