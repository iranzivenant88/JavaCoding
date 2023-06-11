class ParentExFive{
	private void m6(){
		System.out.println("ParentEXFive-m6-method");
	}
}
class ChildExFive extends ParentExFive{
	private void m6(){
		System.out.println("ChildExFive-m6-method");
	}

	public static void main(String[]args){
	ChildExFive cf = new ChildExFive();
	cf.m6();
	System.out.println("End main Method");
	}
}