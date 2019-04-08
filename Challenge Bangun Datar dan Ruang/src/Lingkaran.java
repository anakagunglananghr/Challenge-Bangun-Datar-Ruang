
public class Lingkaran {
	protected double radius;
	public Lingkaran() {
		
	}
	
	public Lingkaran(double radius) {
		super();
		this.radius = radius;
	}
	
	public void LuasLingkaran() {
		double luas = Math.PI*Math.pow(radius, 2);
		System.out.println("Luas lingkaran adalah: "+luas);
	}
	
	public void KelilingLingkaran() {
		double keliling = Math.PI*radius*2;
		System.out.println("Keliling lingkaran adalah: "+keliling);
	}
	
}
