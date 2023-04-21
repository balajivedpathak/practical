package String;

public class ImmutableTest {
	public static void main(String[] args) {
		String str="Ajay";
		str.concat("Kshirsagr"); //insert the string at the end
		str=str.concat("Kshirsagr"); //it will print the AjayKshirsagar
		//it will print only Ajay because "string is immutable" 
		System.out.println(str);
	}

}
