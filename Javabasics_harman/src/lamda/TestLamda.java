package lamda;

public class TestLamda {

	public static void main(String[] args) {
		MyDraw myDraw = new MyDraw();
		myDraw.draw();
		//after lamda expression came
		Drawable d2 = () -> {System.out.println("lamda's drawing");		};
		d2.draw();
		
		Sayable s2 = (name)->{ return "hello "+name; };
		System.out.println(s2.say("abdul"));
		
		//life without lamda
		MySay mySay = new MySay();
		System.out.println(mySay.say("ansari"));
	}
}
