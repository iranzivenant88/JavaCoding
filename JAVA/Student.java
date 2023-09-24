public class Student extends Thread{
	String name;
	public Student(String name){
		this.name = name;
	}
	public void run(){
		Thread.currentThread().setName(this.name);
		for(int i = 0;i<20;i++){
		System.out.println(i + " "+Thread.currentThread().getName());
		try{
			Thread.sleep(14);
		}catch(Exception e){
			System.out.println("Something wrong happened");
		}
		
	}

	}
	
}