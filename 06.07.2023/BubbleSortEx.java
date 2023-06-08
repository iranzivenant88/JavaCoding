import java.util.*;

public class BubbleSortEx{
	public static void main(String[]args){
		List<Integer>arrList = Arrays.asList(6 , 5 , 8 ,4,2);

		sortingMethod(arrList);
		printArray(arrList);

	}
	public static void printArray(List<Integer>list){
		for(int x: list){
		System.out.println(x);
		}

	}

	public static void sortingMethod(List<Integer>arrList){
		boolean swap = true;
	//arrList=[6 5 8 4 2]  || 2 4 5 6 8
		while(swap){
			swap = false;
			for(int i = 0; i < arrList.size()-1; i++){
				if(arrList.get(i) > arrList.get(i + 1)){
					swap = true;
					int temp = arrList.get(i);
					arrList.set(i, arrList.get(i+1));
					arrList.set(i+1, temp);
				}
			}

		}

	}


}