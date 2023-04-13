package Abstraction;

interface Shape {
	void sides(); //abstract method
	default void show() { //default method
		System.out.println("default method");
	}
	static int sqaure (int a) {//static method
		return a*a;
	}
}

class rectangle implements Shape {
	@Override
	public void sides() {
		// TODO Auto-generated method stub
		System.out.println("paretn abstract method");
	}	
}

//public interface InterfaceEg3 {
	class  InterfaceEg3 {
	public static void main(String[] args) {
		Shape obj=new rectangle();
		obj.show();
		obj.sides();
		System.out.println(Shape.sqaure(2));
	}
}


