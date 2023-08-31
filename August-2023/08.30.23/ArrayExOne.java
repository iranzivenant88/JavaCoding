package org.testone.arrayexample;
public class ArrayExOne{
	public static void main(String...args){
	int[][][]arrayOne = new int[3][2][3];
	arrayOne[0][0][0] = 'm';
	arrayOne[0][0][1] = 90;
	arrayOne[0][0][2] = 87;
	arrayOne[0][1][0] = 99;
	arrayOne[0][1][1] = 112;
	arrayOne[0][1][2]= 66;

	arrayOne[1][0][0] = 74;
	arrayOne[1][0][1] = 32;
	arrayOne[1][0][2] = 'A';

	arrayOne[1][1][0] = 'b';
	arrayOne[1][1][1] = 38;
	arrayOne[1][1][2] = 'G';

	arrayOne[2][0][0] = 56;
	arrayOne[2][0][1] = 'B';
	arrayOne[2][0][2] = 'E';

	arrayOne[2][1][0] = 91;
	arrayOne[2][1][1] = 'U';
	arrayOne[2][1][2] = 'z';
	System.out.println(arrayOne);
	System.out.println("lenght of array is :"+arrayOne.length);
	for(int grandParent=0;grandParent<arrayOne.length;grandParent++){
	System.out.println();
		for(int parent = 0;parent<arrayOne[grandParent].length;parent++){
			System.out.println();
			for(int child = 0;child <arrayOne[grandParent][parent].length;child++){
		//System.out.println();
		System.out.print(arrayOne[grandParent][parent][child]+" ");
		//System.out.println();

		}
		System.out.println();
	}
}
	System.out.println("End of main method");



	}
}