public class Lens{
	String brand;
	String focalLength;
	boolean isPrime;
	public Lens(String brand,
	String focalLength,
	boolean isPrime){
		this.brand = brand;
		this.focalLength = focalLength;
		this.isPrime = isPrime;
	}
	public String toString(){
		return brand+" "+focalLength+" "+isPrime;
	}
}