package FinalVariable;

//final keyword
//final class ---can not extend the final class

final class FinalClass {
	void show() {
		System.out.println("Final class method");
	}
	
	/*class test extends FianlClass { //cant extend final class
		void show() {
			System.out.println("child class override method");
		} */

public static void main(String[] args) {
	FinalClass t=new FinalClass();
	t.show();
}
}

