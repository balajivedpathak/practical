package Encapsulation;

class Java_Batch { // encapsulated class
	//private data mamber-without private data member encapsulation is not possible
	
	private String name;
	private int batch_Id;
	
	public String getName() { //geter-setter method 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBatch_Id() {
		return batch_Id;
	}
	public void setBatch_Id(int batch_Id) {
		this.batch_Id = batch_Id;
	}	
}

public class Encp_Test1 { //main class
	public static void main(String[] args) {
		Java_Batch obj=new Java_Batch();
		obj.setName("Solapur Batch");
		obj.setBatch_Id(4778);
		System.out.println(obj.getName()+" "+obj.getBatch_Id());
	}

}
