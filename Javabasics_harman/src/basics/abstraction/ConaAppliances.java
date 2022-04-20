package basics.abstraction;

import basics.encapsultion.Programmer;

public class ConaAppliances extends Programmer implements SwitchBoardListener{
	java.sql.Date myDate;
	java.util.Date urDate;
	
	@Override
	public void switchOne() {
		System.out.println("cona light is on");
		Programmer programmer = new Programmer();
		programmer.setAge(14);
		/*
		 * ConaAppliances conaAppliances = new ConaAppliances(); conaAppliances.age =
		 * 14;
		 */
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
