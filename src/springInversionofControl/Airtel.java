package springInversionofControl;

public class Airtel implements Sim{
	
	public Airtel() {
		System.out.println("i'm in airtel sim");
	}
	
	public void calling() {
		System.out.println("Calling from Airtel Sim");
	}
	
	public void data() {
		System.out.println("Using data in Airtel sim");
	}
}
