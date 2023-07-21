public class SwitchExample{
	public static void main(String[]args){
		String degree = "None";

		switch(degree){
			case "Bachelor":
				System.out.println("You have a bachor's degree");
					break;

			case "Masters": 
				System.out.println("you have a Masters degree");
					break;

			case "PHD": 
				System.out.println("You have a phd degree");
					break;

			default:System.out.println("No Valid Case available");
				break;
		}

	}
}