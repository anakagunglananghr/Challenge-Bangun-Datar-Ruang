
public class Kubus extends Persegi {
	
	public Kubus() {
		
	}

	public Kubus(double sisi) {
		super(sisi);
		
	}
	
	public void VolumeKubus() {
		double volume = Math.pow(getSisi(), 3);
		System.out.println("Volume Kubus adalah: "+volume);
	}
	
	public void KelilingKubus() {
		double keliling = 12*getSisi();
		System.out.println("Keliling Kubus adalah: "+keliling);
	}
}
