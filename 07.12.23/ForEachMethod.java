import java.util.*;
import java.util.stream.Collectors;

public class ForEachMethod{
	public static void main(String...venant){
		List<Integer>numbers = Arrays.asList(1,2,4,6,5);
		List<Integer> num2 = numbers.stream()
		.filter(a->a%2==0)
		.collect(Collectors.toList());
		System.out.println(num2);
		

		numbers.stream()
		.filter(a->a % 2 == 0).forEach(a -> System.out.println(a));
		System.out.println(numbers);

		numbers.forEach(System.out::println);
		}
}
