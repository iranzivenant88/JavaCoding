package kgl.bala.arrayexampletwo;
public class ArrayTwo{
public static void main(String...args){
	int[][][]arrayTwo ={
						{
							{12,34},
							{23,45},
							{15}

						},

						{

						{10},
						{13,78},
						{90,100}

						}
	

	};
			System.out.println(arrayTwo);
			System.out.println("The length of array is "+arrayTwo.length);
			for(int grandParent = 0;grandParent<arrayTwo.length;grandParent++){
				for(int parent = 0;parent<arrayTwo[grandParent].length;parent++){

				System.out.println();
					for(int child = 0;child<arrayTwo[grandParent][parent].length;child++){
						System.out.print(arrayTwo[grandParent][parent][child]+" ");
					}

				}
				System.out.println();
			}
			System.out.println("End of main method");



}
}