public class ChildAnimal extends ParentAnimal{
	public static void main(String...args){

		ParentAnimal pa = new ParentAnimal();
		pa.setAge(23);
		int age = pa.getAge();
		System.out.println(age);

	}
	
}