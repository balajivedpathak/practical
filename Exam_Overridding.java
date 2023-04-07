package MethodOverridding;

class exam{//parent class
	int marks( ) { //parent class method
	return 0;
	}}

class comp extends exam { //1st child class
	int marks() {
		return 80;
	}}
class math extends exam { //2nd child class
	int marks() {
		return 70;
	}}
class science extends exam { //3rd child class
	int marks() {
		return 50;
	}}

class eng extends exam { //4th child class
	int marks() {
		return 90;
	}}

public class Exam_Overridding {
	public static void main(String[] args) {
		comp c=new comp();
		math m=new math();
		science s=new science();
		eng e=new eng();
		
		System.out.println("The marks of Comp is:"+c.marks());
		System.out.println("The marks of maths is:"+m.marks());
		//System.out.println("The marks of science is:"+s.marks());
		//System.out.println("The marks of eng is:"+e.marks());
		s.marks();
		e.marks();
	}
}
