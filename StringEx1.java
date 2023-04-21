package String;

public class StringEx1 {
	public void show() {
		// TODO Auto-generated method stub
		char [] arr= {'j','a','v','a'}; //char type array
		System.out.println(arr);
		String s=new String(arr);//by using new keyword creating string
		System.out.println("Value is:"+s); //java
	}
	
	public void myFunction() { //method 2
		String s1= "Ajay"; //string literal(creating obj of string);
		String s2="Ajay"; //it does not create any new object
		String s3=new String(s1);
		System.out.println(s3);//Ajay			
	}
	public static void main(String[] args) {
		StringEx1 str=new StringEx1();
		str.show();
		str.myFunction();
	}		
}
