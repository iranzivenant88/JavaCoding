public class StudentTester{
	public static void main(String[]args){
		Student st1 = new Student();
		st1.setStudentId(11);
		st1.setName("Vinay");
		st1.setQualifyingExamMarks(76.3f);
		st1.setyearOfEngg(3);

		int st1Id = st1.getStudentId();
		String st1Name = st1.getName();
		float st1QualifyingExamMarks = st1.getQualifyingExamMarks();
		int st1YearOfEngg = st1.getYearOfEngg();

		System.out.println("Student id is : "+st1Id);
		System.out.println("student name is : "+st1Name);
		System.out.println("Marks are : "+st1QualifyingExamMarks);
		System.out.println("year of Eng are : "+st1YearOfEngg);
	}
}