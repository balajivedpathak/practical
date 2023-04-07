package MethodOverridding;

class Father {
	void shoot() {
		System.out.println("I am the father! I am a right handed shooter");
	}
}

class Child extends Father {
	void shoot() { //override method
		System.out.println("I am the son! I am a left handed shooter");
	}
}

public class MethodOverriddingRL {
	public static void main(String[] args) {
		Father f=new Father();
		f.shoot();//here the parent class method gets called
		Father fc=new Child();
		fc.shoot();//this is dynamic dispatch. 
		   //the compiler decided method call at rumtime.
	}

}
