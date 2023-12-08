class Solution {
    public boolean isValid(String s) {
        // Create a HashMap to store the mappings of opening and closing brackets
        HashMap<Character, Character> map = new HashMap<>(); 
        map.put('(', ')'); 
        map.put('[', ']'); 
        map.put('{', '}');
        
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>(); 
        
        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Get the current character
            
            // If the character is an opening bracket, push it onto the stack
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                // If the character is a closing bracket
                if (!stack.empty()) {
                    char x = stack.peek(); // Look at the top of the stack
                    // Check if the current closing bracket matches the corresponding opening bracket
                    if (c == map.get(x)) {
                        stack.pop(); // Pop the matching opening bracket from the stack
                    } else {
                        return false; // If not matching, the string is not valid
                    }
                } else {
                    return false; // If the stack is empty and a closing bracket is encountered, the string is not valid
                }   
            }
        }
        
        // After iterating through the entire string, check if the stack is empty
        // If it's empty, all brackets had matching pairs, and the string is valid
        return stack.empty(); 
    }
}
