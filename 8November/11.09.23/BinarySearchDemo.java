
public class BinarySearchDemo{
	public static void main(String...args){
		int [] array ={3,11,21,29,41,54,61,78,110,127};
		int target = 21;

	}
	public static int BinarySearchExample(int array[], int target ){
		int i  = 0;
		int j = array.length-1;

		int medium = i +j / 2;

		if(target == array[medium]){
			return array[medium];
		} else if (array[medium] > target){
			j = medium -1;

		}else if(array[array[medium]<target){
		i = medium+1;

		}
		return 0 ;

	}
}



