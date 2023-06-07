class Animal{}
class Tiger extends Animal{}
class Dee
{
	public void m1(Animal a ){
		System.out.println("Animal version");
	}
	public void m1(Tiger m)
	{
	System.out.println("Tiger version");
	}
	public static void main(String[]args){
	Dee d = new Dee();
	Animal a = new Animal();
	d.m1(a);

	Tiger t = new Tiger();
	d.m1(t);

	Animal a1 = new Tiger();
	d.m1(a1);
	}
}