/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
2==>0
7==>1
11==>2
15==>3
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
import java.util.HashMap;
import java.util.Map;
public class SumOfTwoNumbers{
public static void main(String...args){
	
}
public int[] getSum(int[] nums, int target){
Map<Integer,Integer>map = new HashMap<>();
	for(int i = 0;i<nums.length;i++){
		int compliment = target-nums[i];
		if(!map.containsKey(nums[i])){
			map.put(nums[i],map.get(nums[i]));
		}
	}
	return new int[]{map.get(nums[i]),i};

}
	
}