package FinalVariable;

class FinalMethod1 { //parent class
	final void display() {//create a final method
		System.out.println("this is a final method");	
	}
}
class child1 extends FinalMethod1 { //child class name main
	/*public final void display () { //parent class method
	 * System.out.println("the final method is overridding");
	 * }
	 */
}
public class FinalMethod {//main class
	public static void main(String[] args) {
		child1 obj=new child1();
		obj.display();
	}

}
