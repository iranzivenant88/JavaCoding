package kgl.arrayexampleone;
public class ArrayOne{
	public static void main(String...args){
		System.out.println("start of main method");
	int[][][]arrayOne = new int[4][5][3];
	arrayOne[0][0][0] = 12;
	arrayOne[0][0][1] = 'm';
	arrayOne[0][0][2] = 'k';
	
	arrayOne[0][1][0] = 95;
	arrayOne[0][1][1] = 11;
	arrayOne[0][1][2]=  65;

	arrayOne[0][2][0] = 'T';
	arrayOne[0][2][1] = 'K';
	arrayOne[0][2][2] = 'A';

	arrayOne[0][3][0] = 5;
	arrayOne[0][3][1] = 32;
	arrayOne[0][3][2] = 'Y';

	arrayOne[0][4][0] = 56;
	arrayOne[0][4][1] = 'B';
	arrayOne[0][4][2] = 'E';


	arrayOne[1][0][0] = 'T';
	arrayOne[1][0][1] = 'M';
	arrayOne[1][0][2] = 'K';
	
	arrayOne[1][1][0] = 9;
	arrayOne[1][1][1] = 1;
	arrayOne[1][1][2]=  5;

	arrayOne[1][3][0] = 'a';
	arrayOne[1][3][1] = 'b';
	arrayOne[1][3][2] = 'c';

	arrayOne[1][3][0] = 5;
	arrayOne[1][3][1] = 32;
	arrayOne[1][3][2] = 'Y';

	arrayOne[1][4][0] = 51;
	arrayOne[1][4][1] = 45;
	arrayOne[1][4][2] = 34;


	arrayOne[2][0][0] = 's';
	arrayOne[2][0][1] = 'm';
	arrayOne[2][0][2] = 'b';
	
	arrayOne[2][1][0] = 93;
	arrayOne[2][1][1] = 13;
	arrayOne[2][1][2]=  53;

	arrayOne[2][2][0] = 'k';
	arrayOne[2][2][1] = 'b';
	arrayOne[2][2][2] = 'n';

	arrayOne[2][3][0] = 52;
	arrayOne[2][3][1] = 3;
	arrayOne[2][3][2] = 'Y';

	arrayOne[2][4][0] = 51;
	arrayOne[2][4][1] = 45;
	arrayOne[2][4][2] = 34;


	arrayOne[3][0][0] = 's';
	arrayOne[3][0][1] = 'm';
	arrayOne[3][0][2] = 'b';
	
	arrayOne[3][1][0] = 93;
	arrayOne[3][1][1] = 13;
	arrayOne[3][1][2]=  53;

	arrayOne[3][2][0] = 'k';
	arrayOne[3][2][1] = 'b';
	arrayOne[3][2][2] = 'n';

	arrayOne[3][3][0] = 52;
	arrayOne[3][3][1] = 3;
	arrayOne[3][3][2] = 'Y';

	arrayOne[3][4][0] = 51;
	arrayOne[3][4][1] = 45;
	arrayOne[3][4][2] = 34;

	System.out.println(arrayOne);
	System.out.println("lenght of array is :"+arrayOne.length);
	for(int grandParent=0;grandParent<arrayOne.length;grandParent++){
	System.out.println();
		for(int parent = 0;parent<arrayOne[grandParent].length;parent++){
			System.out.println();
			for(int child = 0;child <arrayOne[grandParent][parent].length;child++){		
		System.out.print(arrayOne[grandParent][parent][child]+" ");
		
		}
		System.out.println();
	}
}
	System.out.println("End of main method");


	}
	
}