package collection.sortedmap;

public class ModelData {

	private Integer number;
	private String namer;
	
	public ModelData() {
		super();
	}

	public ModelData(Integer number, String namer) {
		super();
		this.number = number;
		this.namer = namer;
	}	
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getNamer() {
		return namer;
	}
	public void setNamer(String namer) {
		this.namer = namer;
	}


}
