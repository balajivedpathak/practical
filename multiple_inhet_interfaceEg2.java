package Abstraction;
//multiple inheritance
interface LCV_Vehicle { //parent interface A
	void running();
}

interface Commercial_Vehicle { //parent interface B
	void capacity();
}

class Car implements LCV_Vehicle,Commercial_Vehicle { //child class
	void speed() {//child class own method
		System.out.println("Car speed is very high");
	}
	@Override
	public void running() {
		System.out.println("parent interface method ");
	}		
}

public interface multiple_inhet_interfaceEg2 {
	public static void main(String[] args) {
		Car c = new Car();
	    c.running(); // prints "1st parent interface method"
	    //c.capacity(); // prints "2nd parent interface method"
	    c.speed(); // prints "Car speed is very high"
	}

}
