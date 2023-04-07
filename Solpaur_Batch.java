package Super;
//real world example of super keyword
class Student { //parent class
	int std_id;
	String Name;
	
	Student(int std_id, String Name) {//parent class constructor
		this.std_id=std_id;
		this.Name=Name;
	}
}

class Course extends Student { //child class
	float fees; //child class data member
	Course(int std_id, String Name,float fees) {
		super(std_id,Name); //try to reuse parent class cons
		this.fees=fees;
	}
	void show() {
		System.out.println(std_id+" "+Name+" "+fees);
	}
}

public class Solpaur_Batch {
	public static void main(String[] args) {
		Course obj=new Course(1,"Ajay Kshirsagar",25000f);
		obj.show();
	}
}
