package Array;

public class CopyArray {
	public static void main(String[] args) {
		//declaring source array
		char []copyFrom = {'d','e','c','f','f','e','i','n'};
		////declaring destination arrya
		char []copyTo=new char[7];//new array
		System.arraycopy(copyFrom,2,copyTo,2,5);  //--cffe--
		//print the destination array
		System.out.println(String.valueOf(copyTo));
		
	}

}
