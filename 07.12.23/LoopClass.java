public class LoopClass{
	public static void main(String...args){
		int [] numbers = {23,24,56,78};
		for(int i = 0;i<numbers.length ;i++){
			System.out.println(numbers[i]);
		}

		System.out.println("===============");

		for(int num : numbers){
			System.out.print(num+" ");
		}
		System.out.println();

	}
}