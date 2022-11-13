package odev03.overriding;

public class BaseCrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	
}
//if you don't want any other object to override the base operation use : 
//public final