package FinalVariable;
// Final keyword --provide restrictions
//final variable --cannot change the value of final variable 
public class FinalVariable {
	final int value = 50;//initiallization of final variable 
	void display() {
		//value = 70;
		System.out.println(value);
		//we can't change the value of final variable 
		//compile time error
	}
	public static void main(String[] args) {
		FinalVariable fv = new FinalVariable();//creating object 
		fv.display();
	}
}
