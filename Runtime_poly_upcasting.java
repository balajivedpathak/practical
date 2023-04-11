package polymorphism;

/*if the referance variable of parent class refers
 * to the object of child class
 */

class A{
	void run() {
		System.out.println("Parent class method");
	}
}
class B extends A {
	///using Super() method here, for sop output of parent class A
	void run() {
		System.out.println("child class imlementation");
	}
}
public class Runtime_poly_upcasting {
	public static void main(String[] args) {
		A obj= new B();//upcasting
		obj.run();
	}

}
	