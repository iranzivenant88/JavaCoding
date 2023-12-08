/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
public class StackExample{
	public static void main(String...args){
		String str = "([][]())";
		boolean result = validString(str);
		System.out.println(result);

	}

	public static boolean validString(String str){
		Map<Character,Character> map = new HashMap<>();
		map.put('(',')');
		map.put('[',']');
		map.put('{','}');
		
		Stack<Character> stack = new Stack<>();

		for(int i = 0; i < str.length()-1;i++){
			char c = str.charAt(i);

			if(map.containsKey(c)){
				stack.push(c);
			}else{
				if(stack.empty()){
					return false;
				}else{
					char x = stack.peek();
					if(map.get(x)==c){
						return true;
					}
					return false;
				}

			}
		}
		return stack.empty();
	}
}