package kgl.arrayexample;
public class ArrayThree{ 
public static void main(String...args){
	System.out.println("Start of main method");
	double[][]arrayThree = {
		{12,34},
		{11,23},
		{21,11},
		{88,90}
	};
	System.out.println(arrayThree);
	System.out.println("Array Length is"+arrayThree.length);
	System.out.println("Print elements with for loop:");
	for(int parent=0;parent<arrayThree.length;parent++){
		System.out.println();
		for(int child = 0;child<arrayThree[parent].length;child++){
		System.out.println(parent+ " has this child : ");
		System.out.println(arrayThree[parent][child]);
		System.out.println();
		}
		
		
	}
	System.out.println("End of main method");
}
}