class DuplicateInString{
	public static void main(String...args){
		/*return the first duplicated charcater in a given string*/
		String str = "Hello";
		getDuplicatedCharacter(str);

	}

	public static char getDuplicatedCharacter(String str){

		for (int i = 0;i<str.length();i++){
			for(int j = i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					System.out.println(str.charAt(i));
					return str.charAt(i);
				}
			}
		}
		return 0;


	}
}