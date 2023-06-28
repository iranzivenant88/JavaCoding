public class ParentExTwo{
	private int age ;
	protected double multiply(double a , double b){
		System.out.println("Start of multiply Method");
		double result = a * b;
		return result;
	}

	protected int getAge(){
		return age;
	}
	protected void setAge(int age){
		this.age = age ;
	}
}