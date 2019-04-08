
public class Balok extends PersegiPanjang {
	protected double lebar;
	
	
	public Balok() {
		
	}

	public Balok(double panjang, double tinggi, double lebar) {
		super(panjang, tinggi);
		this.lebar = lebar;
	}
	
	public void VolumeBalok() {
		double volume = panjang*tinggi*lebar;
		System.out.println("Volume Balok adalah: "+volume);
	}
		

	public void KelilingBalok() {
		double keliling = 4*(panjang+tinggi+lebar);
		System.out.println("Keliling Balok adalah: "+keliling);
	}
	
}
