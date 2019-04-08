
public class Bola extends Lingkaran {

	public Bola() {
		
	}

	public Bola(double radius) {
		super(radius);
		
	}
	
	public void VolumeBola() {
		double volume = 4/3*(Math.PI*Math.pow(radius, 3));
		System.out.println("Volume bola adalah: "+volume);
	}
	
	public void KelilingBola() {
		double keliling = 4/3*(Math.PI*Math.pow(radius, 2));
		System.out.println("Keliling bola adalah: "+keliling);
	}

}
