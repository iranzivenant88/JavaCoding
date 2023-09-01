package kgl.arrayexampleone;
public class ArrayTwo{
	public static void main(String...args){
		System.out.println("start of main method");
	int[][][]arrayTwo = new int[2][2][4];
	arrayTwo[0][0][0] = 12;
	arrayTwo[0][0][1] = 'm';
	arrayTwo[0][0][2] = 'k';
	arrayTwo[0][0][3] = 95;


	arrayTwo[0][1][0] = 11;
	arrayTwo[0][1][1]=  65;
	arrayTwo[0][1][2] = 'T';
	arrayTwo[0][1][3] = 'K';

	arrayTwo[1][0][0] = 12;
	arrayTwo[1][0][1] = 'm';
	arrayTwo[1][0][2] = 'k';
	arrayTwo[1][0][3] = 95;

	arrayTwo[1][1][0] = 11;
	arrayTwo[1][1][1]=  65;
	arrayTwo[1][1][2] = 'T';
	arrayTwo[1][1][3] = 'K';

	System.out.println(arrayTwo);
	System.out.println("lenght of array is :"+arrayTwo.length);
	for(int grandParent=0;grandParent<arrayTwo.length;grandParent++){
	System.out.println();
		for(int parent = 0;parent<arrayTwo[grandParent].length;parent++){
			System.out.println();
			for(int child = 0;child <arrayTwo[grandParent][parent].length;child++){		
		System.out.print(arrayTwo[grandParent][parent][child]+" ");
		
		}
		System.out.println();
	}
}
	System.out.println("End of main method");


	}
	
}