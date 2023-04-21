package String;

public class MultableExString {
	public static void my() {
		//String Buffer
		StringBuffer s=new StringBuffer("Hello");//object of string buffer
		s.append("World");
		System.out.println("String is..."+s);//hello world 
		s.insert(2, "Riya");  //int off set , string set
		System.out.println("insert is..:"+s); //HelloRiya World
		s.replace(1, 3, "java");   //beingwith, endwith, string s
		System.out.println("Replacce is..:"+s);  //Hjavalloworld
		System.out.println("Capacity is..:"+s.capacity());
	}
	
	//String Builder
	
	/* StringBuilder s1= new StringBulider("Wolrd");
	s1.replace(1,3,"java");    //wjava
	System.out.println("Replace is..:"+s1); 
	s1.delete(1,3);
	System.out.println("Delete is..:"+s1);
	s1.reverse();
	System.out.println("Reverse is..:"+s1);
	} 
	*/
	
	public static void main(String[] args) {
		my();
		
	}						
}