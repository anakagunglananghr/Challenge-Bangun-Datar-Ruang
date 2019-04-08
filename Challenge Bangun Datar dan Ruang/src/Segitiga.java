
public class Segitiga {
	
	protected double alas;
	protected double tinggi;
	protected double sisi1;
	protected double sisi2;
	
	public Segitiga() {
		
	}

	public Segitiga(double alas, double tinggi) {
		super();
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	public void LuasSegitiga() {
		double luas = 0.5*alas*tinggi;
		System.out.println("Luas segitiga adalah: "+luas);
	}
	
	public void KelilingSegitiga() {
		double keliling = alas+sisi1+sisi2;
		System.out.println("Luas segitiga adalah: "+keliling);
	}
	
}
