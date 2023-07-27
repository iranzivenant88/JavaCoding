public class SingletonPattern{

	public static void main(String...args){
		getSingleton();

	}
	private static SingletonPattern instance;

	private SingletonPattern(){

	}

	public static SingletonPattern getSingleton(){
		if(instance == null){
			return instance = new SingletonPattern();
		}
		return instance;
	}
}