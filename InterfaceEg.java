package Abstraction;

interface shape {
	void shape_name();//abstract method
	}
class User_circle implements shape {
	@Override
	public void shape_name() {
		System.out.println("Draw a circle");
	}
}
class User_traingle implements shape {
	@Override
	public void shape_name() {
		System.out.println("Draw a traingle");	
}
}

public interface InterfaceEg {
	public static void main(String[] args) {
		shape obj=new User_traingle();
		obj.shape_name();
		
		shape s=new User_circle();
		s.shape_name();
		

	}
}
