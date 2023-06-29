public class ParentExTwo{
	String name ;
	double income;

	public ParentExTwo(){}// no parameterized constructor

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setIncome(double income){
		this.income = income;
	}

	public double getIncome(){
		return income;
	}
	protected int getNumber(int i){
		int value = i;
		return value;
	}
}