
public class Persegi {
	
	protected double sisi;	
	
	public Persegi() {
		
	}
	
	public Persegi(double sisi) {
		super();
		this.sisi = sisi;		
	}

	
	public void LuasPersegi() {
		double luas = sisi * sisi;
		System.out.println("Luas persegi adalah: "+luas);
	}
	
	public void KelilingPersegi() {
		double keliling  = sisi * 4;
		System.out.println("Keliling persegi adalah: "+keliling);
	}
	

	public double getSisi() {
		return sisi;
	}

	public void setSisi(int sisi) {
		this.sisi = sisi;
	}

	

}
