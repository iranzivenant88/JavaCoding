
public class MaxClass {
	public static void main(String[]args){
		int [] numbers = {2,4,7,2,4};	
		int max = getMaxNumber(numbers);
		System.out.println("The max number is : "+max);
	}
	public static int getMaxNumber(int[]numbers){
		int maxNum = numbers[0];
		for(int i = 0;i<numbers.length;i++){
			if(numbers[i]>maxNum){
				maxNum = numbers[i];
			}
		}

		return maxNum;
	}
		
}