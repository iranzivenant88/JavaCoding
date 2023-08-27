public class ArrayTestTwo2{
	public static void main(String...args){
	System.out.println("Start of main method");
		int[]arrayOne = {40,50,20,10};
		System.out.println(arrayOne);
		System.out.println(arrayOne.length);
		for(int index = 0;index<arrayOne.length;index++){
			System.out.println("The index is  :"+index);
			System.out.println("The element is :"+arrayOne[index]);
		}
		System.out.println("End of main method");
	}
}