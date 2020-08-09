package oops.encapsulation;

public class Encap {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id>2080) {
			System.out.print("The id can't be greater than 2080");
		}
		else {
		this.id = id;
	}
	}
	
	

}