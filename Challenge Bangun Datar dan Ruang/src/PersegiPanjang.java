
public class PersegiPanjang {
	protected double panjang;
	protected double tinggi;
	
	public PersegiPanjang() {
		
	}

	public PersegiPanjang(double panjang, double tinggi) {
		super();
		this.panjang = panjang;
		this.tinggi = tinggi;
	}
	
	public void LuasPersegiPanjang() {
		double luas = panjang*tinggi;
		System.out.println("Luas Persegi Panjang adalah: "+ luas);
	}

	public void KelilingPersegiPanjang() {
		double keliling = 2*(panjang+tinggi);
		System.out.println("Keliling Persegi Panjang adalah: "+ keliling);
	}

	public double getPanjang() {
		return panjang;
	}

	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}
	
}
