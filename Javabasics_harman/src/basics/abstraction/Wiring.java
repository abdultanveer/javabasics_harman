package basics.abstraction;

public class Wiring {
	public static void main(String[] args) {
		//wiring switchboard with appliances

		SwitchBoardListener sbl = new HavellsAppliances();
				//new ConaAppliances(); 
		sbl.switchOne();
		sbl.switchTwo();
		sbl.switchThree();
		sbl.switchFour();
	}

}
