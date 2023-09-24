public class StudentTester{
	public static void main(String[]args){
		Student st1 = new Student("Thread-A");
		System.out.println("This a test class");
		st1.start();
		System.out.println("This a test class");

		Student st2 = new Student("Thread-B");
		st2.start();
		
	}
}