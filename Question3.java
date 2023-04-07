package MethodOverridding;
import java.util.Scanner;

class Parent {
	void show(int p) {
		System.out.println("The value of p:"+p+" ");
	}
	void print(int q) {
		System.out.println("The value of q:"+q+" ");
	}
}

class New_Child extends Parent {
	@Override
	void show(int p) {
		System.out.println("The value of r:"+p+" ");
	}
	@Override
	void print(int q) {
		System.out.println("The suare s:"+q*q+"");
	}
}

public class Question3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int p=sc.nextInt();
			int q=sc.nextInt();
			int r=sc.nextInt();
			int s=sc.nextInt();
			
			Parent obj1=new Parent();
			obj1.show(p);
			obj1.print(q);
			
			Parent obj2=new New_Child();
			obj2.show(r);
			obj2.print(s);
			t--;
		}
	}

}
