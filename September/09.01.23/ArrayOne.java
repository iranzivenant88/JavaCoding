package org.venant.arrayexampleone;
public class ArrayOne{
	public static void main(String...args){
	System.out.println("Start of main method");
	int[][][]arrayOne = {
							{
								{10,55,50},
								
								{20,30,40}
							},

							{
								{30,40,22},
								{31,32,41}
							}
								
						};
	System.out.println(arrayOne);
	System.out.println("length of array is : "+arrayOne.length);
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