package MethodOverridding;

class BiCycle { // parent class
	String define_me() {
		return "a vehicle with padels.";
	}
}
class MotorCycle extends BiCycle {
	String define_me() {
		return "a vehicle with engine.";
	}
	MotorCycle(){
		System.out.println("Hello, I am a motorcycle, I am "+define_me());
		String temp=super.define_me(); //using super method  for calling parent 
		System.out.println("My ancestor is a cycle who is "+temp);
	}
}
public class Question1 {
	public static void main(String[] args) {
		MotorCycle m=new MotorCycle();
	}

}
