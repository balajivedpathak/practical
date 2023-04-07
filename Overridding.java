package MethodOverridding;

 /* Method Over ridding  
  * 1. same name method
  * 2.same parameter
  * 3.IS-A relation
  */

//creating parent class
class TestOverridding {
	void run( ) {//method 1
		System.out.println("running mode on");
	}
}

//creating child class
class Overridding extends TestOverridding {
	//definign same name method as its declared in the parent class
	void run() {
		System.out.println("running mode off");
	}
	public static void main(String[] args) {
		//crating a object of a child class
		Overridding obj=new Overridding();
		obj.run();
	}
}

