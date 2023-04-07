package Super;
/*super keyword- reference variable which refer immediate parent class object
 * (IV, method,con)
 * 3-usage of super keyword 
 * 2-refer immediate parent class constructor
 */
//by using super keyword we can use parent class data member

class Shape {//parent class
	String name = "circle"; //data member of parent class
}
class Size extends Shape { //child class
	String name = "No Size"; //data member of child class
	void print() { //child class method 
		System.out.println(name);//it present child class
		//it present immidiate paraent class IV
		System.out.println(super.name);
	}
}

public class SuperIV_InstanceVariable {
	public static void main(String[] args) {
		Size obj=new Size();
		obj.print();
	}
}
