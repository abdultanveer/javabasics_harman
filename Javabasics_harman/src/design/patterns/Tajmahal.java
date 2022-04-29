package design.patterns;

public class Tajmahal {
	
    private static Tajmahal agraTaj;

	
	private Tajmahal() {}

	public static Tajmahal getInstance()
    {
        if (agraTaj == null)
        	agraTaj = new Tajmahal();
        return agraTaj;
    }
}
