package lamda.methodrefs;

public class DemoMethodRefs {
	public static void main(String[] args) {
		Sayable sayable = ()-> {System.out.println("lamda here");};
		sayable.say();
		
		Sayable mSayable = DemoMethodRefs::someMethod;
		mSayable.say();
	}
	
	
	static void  someMethod() {
		System.out.println("my some method");
	}

}
