package Encapsulation;

public class ReadOnlyEncap {
	//we can read only (only getter method)
	private String name="ak";
	//getter method for name 

	public String getName() {
		return name;
	}

	/* 
	 * public void setName(String name) {
		this.name = name;
	}
	*/

	public static void main(String[] args) {
		ReadOnlyEncap obj=new ReadOnlyEncap();
		//obj.setNme("Aj");//we cant change the value of the name 
		System.out.println(obj.name);
	}
}
