package Abstraction;
//multiple inheritance
interface Vehicle { //parent interface A
	void running();
}

interface Heavy_Vehicle { //parent interface B
	void capacity();
}

class Car implements Vehicle,Heavy_Vehicle { //child class
	void speed() {//child class own method
		System.out.println("Car speed is very high");
	}
	@Override
	public void capacity() {
		System.out.println("2nd parent interface method ");
	}
	
	@Override
	public void running () {
		System.out.println("1sr parent interface method ");
	}
}

public class Multiple_Inherit_Interface {
	public static void main(String[] args) {
		
		Car car = new Car();
	    car.running(); // prints "1st parent interface method"
	    car.capacity(); // prints "2nd parent interface method"
	    car.speed(); // prints "Car speed is very high"
	
		
	}
}
