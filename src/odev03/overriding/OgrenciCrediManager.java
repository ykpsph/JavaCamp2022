package odev03.overriding;

public class OgrenciCrediManager extends BaseCrediManager {
	public double hesapla(double amount) {
		return amount * 1.10;
	}
}


// OgrenciCrediManager extends BaseCrediManager
// and by overriding it we can calculate OgrenciCredi individually 