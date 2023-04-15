package Encapsulation;

public class WriteOnlyEncap {
	//we can write only (only setter method)
	private String name;

	/* public String getName() {
		return name;
	} */

	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		WriteOnlyEncap obj= new WriteOnlyEncap();
		// we can not get the value, there is no get method
		//system.out.prntln("name"+obj.getName());
		System.out.println(obj.name);
	}
	

}
