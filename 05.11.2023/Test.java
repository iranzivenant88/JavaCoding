class Test{
int i = 10; // 0
{
  m1();
  System.out.println("First Instance Block");
}
Test(){
	System.out.println("Constructor");
}
public static void main(String[]args){
	System.out.println("main"); //main
	Test t = new Test();
}
public void m1(){
	System.out.println(j);
}
{
  System.out.println("Second Instance Block");
}
int j = 20;//0

}