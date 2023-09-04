package kgl.arrayexamplethree;
public class ArrayThree{
	public static void main(String...args){
		System.out.println("start of main method");
	boolean[][][]arrayThree = new boolean[3][4][2];
	arrayThree[0][0][0] = false;
	arrayThree[0][0][1] = true;

	arrayThree[0][1][0] = true;
	arrayThree[0][1][1] =false;

	arrayThree[0][2][0] = false;
	arrayThree[0][2][1]= false;

	arrayThree[0][3][0] = true;
	arrayThree[0][3][1] = true;

	arrayThree[1][0][0] = true;
	arrayThree[1][0][1] = true;

	arrayThree[1][1][0] = false;
	arrayThree[1][1][1] = false;

	arrayThree[1][2][0] = true;
	arrayThree[1][2][1]=  true;

	arrayThree[1][3][0] = false;
	arrayThree[1][3][1] = false;

	arrayThree[2][0][0] = true;
	arrayThree[2][0][1]=  true;

	arrayThree[2][1][0] = false;
	arrayThree[2][1][1] = false;

	arrayThree[2][2][0] = true;
	arrayThree[2][2][1]=  true;

	arrayThree[2][3][0] = false;
	arrayThree[2][3][1] = false;

	System.out.println(arrayThree);
	System.out.println("length of array is :"+arrayThree.length);
	for(int grandParent=0;grandParent<arrayThree.length;grandParent++){
	System.out.println();
		for(int parent = 0;parent<arrayThree[grandParent].length;parent++){
			System.out.println();
			for(int child = 0;child <arrayThree[grandParent][parent].length;child++){		
		System.out.print(arrayThree[grandParent][parent][child]+" ");
		
		}
		System.out.println();
	}
}
	System.out.println("End of main method");


	}
	
}