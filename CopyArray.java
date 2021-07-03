package javaprograms;

public class CopyArray {

	public static void main(String[] args) {
//		char copyFrom[]= {'s','s','e','c','a','t'};
//		char copyTo[]= new char[5];
//		System.arraycopy(copyFrom, 3, copyTo, 0, 3);
//		System.out.print(String.valueOf(copyTo));
	
		int copyFrom[]= {1,5,3,8,3,0};
		int copyTo[]=new int[copyFrom.length];
		System.arraycopy(copyFrom, 0, copyTo, 0, 6);
	for(int i=0;i<copyTo.length;i++) {
		System.out.print(copyTo[i] + " ");
	}
	System.out.println(copyFrom==copyTo? "same" : "Difference");
	
		//System.out.println(String.valueOf(copyTo));
	}

}
