package odev03.overriding;

public class Main {

	public static void main(String[] args) {
		BaseCrediManager[] crediManagers = new BaseCrediManager[] 
					{new OgretmenCrediManager(), new TarimCrediManager(), new OgrenciCrediManager()};
		for(BaseCrediManager crediManager : crediManagers) {
			System.out.println(crediManager.hesapla(1000));
		}
	}

}
