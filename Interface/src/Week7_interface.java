interface PhoneInterface {
	final int TIMEOUT = 10000; //constant field
	void sendCall(); //abstract method
	void receiveCall(); //abstract method
	default void printLogo() { // default method
		System.out.println("**Phone**");
	}
}

class SamsungPhone implements PhoneInterface {
	//Implement every abstract methods of PhoneInterface
	@Override 
	public void sendCall() {
		System.out.println("RingRingRing");
	}
	@Override
	public void receiveCall() {
		System.out.println("Got a Call");
	}
	
	public void flash() {
		System.out.println("The light of the phone is on");
	}
}

public class Week7_interface{

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

}
