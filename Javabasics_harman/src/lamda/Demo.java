package lamda;

import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
		Function<String, String> f1;
		f1 = (name) -> {return "harman say hello to --"+ name;};
		System.out.println(f1.apply("abdul"));
	}

}
