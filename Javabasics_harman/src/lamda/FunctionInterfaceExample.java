package lamda;
// importing Function interface  
import java.util.function.Function;  
public class FunctionInterfaceExample {  
	static String show(String message){  
		return "Hello "+message;  
	}  
	public static void main(String[] args) {  
		// Function interface referring to a method  
		Function<String, String> fun = FunctionInterfaceExample::show;  
		// Calling Function interface method  
		System.out.println(fun.apply("Peter"));  
		
		Function<Integer, Integer> squareIt = (a) -> {return a*a;};
		
		System.out.println(squareIt.apply(9));
				
	}  
} 