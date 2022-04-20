package basics.abstraction;

public class ConaAppliances implements SwitchBoardListener{

	@Override
	public void switchOne() {
		System.out.println("cona light is on");
	}

	@Override
	public void switchTwo() {
		System.out.println("cona fan is on");
		
	}

	@Override
	public void switchThree() {
		System.out.println("cona ac is on");
		
	}

	@Override
	public void switchFour() {
		System.out.println("cona bed light is on");
		
	}

}
