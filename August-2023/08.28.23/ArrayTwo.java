package rw.arrayexample;
public class ArrayTwo{ 
public static void main(String...args){
	System.out.println("Start of main method");
	int[][]arrayTwo = {
		{23,12,32},
		{12,34,12},
		{'H','T',12},
		{90,100,110}
	};
	System.out.println(arrayTwo);
	System.out.println("Array Length is"+arrayTwo.length);
	System.out.println("Print elements with for loop:");
	for(int parent=0;parent<arrayTwo.length;parent++){
		System.out.println();
		for(int child = 0;child<arrayTwo[parent].length;child++){
		System.out.println(parent+ " has this child : ");
		System.out.println(arrayTwo[parent][child]);
		System.out.println();
		}
		
		
	}
	System.out.println("End of main method");
}
}