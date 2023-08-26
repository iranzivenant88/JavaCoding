package org.test.arrayexampletwo;
public class ArrayExTwo{
	public static void main(String...args){
	System.out.println("Start of main method");
	int [][]arrayOne = {
						{'P','S',987},
						{33,986,'e'}

						};

	System.out.println("Array One length is :"+arrayOne.length);
		System.out.println("Display elements using loop:");
		for(int index = 0;index<arrayOne.length;index++){
			System.out.println("");//For new line
			for (int value = 0;value<arrayOne[index].length;value++ ) {
				System.out.print(arrayOne[index][value]+ " ");
			}
		}
	

		System.out.println("End of main method");


}

}