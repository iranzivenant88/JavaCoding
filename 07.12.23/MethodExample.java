public class MethodExample{
	
	public static void main(String...args){
		char [] letters = {'A','B','N'};
		int count = countLetter(letters,'B');
		System.out.println(count);

	}
	public static int countLetter(char[]letters,char letterSearch){
		int count = 0;
		for(char letter : letters){
			if(letter==letterSearch){
				count++;
			}
		}
		return count;
		

	}

}