package Super;
/*super keyword- reference variable which refer immediate parent class object
 * (IV, method,con)
 * usage of super keyword 
 * 1-refer immediate parent class constructor
 */

class Shape2 { //parent class
	//default constructor of parent class
	Shape2()
	{
		System.out.println("Hello");
	}
}
class Size2 extends Shape2 { //child class
	//default constructor of child class
	Size2() {
		//invoke immediate parent class constructor line 10
		super();
		System.out.println("hi");
	}
}

public class Supercons {
	public static void main(String[] args) {
		Size2 obj=new Size2(); //creating the obj of child class
	}
}

/* Super() is added in each class constructor automatically by compiler if there is no super();  */ 
