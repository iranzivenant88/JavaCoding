public class LearnString{
	public static void main(String...args){
		String str = new String("inka");
		System.out.println(str.toLowerCase());//inka
		
		String str2 = new String("inka");
		System.out.println(str.equals(str2));


		System.out.println(str.toUpperCase());
		//Random rand = new Random();
		double rand = Math.random();
		System.out.println(rand);
		if(rand<=0.7365645179124702){
			throw  new ArithmeticException("That's not the number we wanted");
		}else{
			System.out.println("This is the number we wanted");
		}
		try{
			String str1 = new String("ibaraza");
			System.out.println(str.charAt(4));
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Out of bound exception");

		}finally{
			System.out.println("everything went well here");
		}
		

	}
}