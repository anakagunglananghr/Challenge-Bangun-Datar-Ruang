import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);

	public Main() {

		System.out.println("<< Bangun Datar >>");
		System.out.println("1. Persegi");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Lingkaran");
		System.out.println("4. Segitiga");
		System.out.println("<< Bangun Ruang >>");
		System.out.println("5. Kubus");
		System.out.println("6. Balok");
		System.out.println("7. Bola");
		System.out.print("Pilih bangun[1-7]: ");
		int choose = scan.nextInt();
		scan.nextLine();

		if (choose == 1) {

			System.out.print("Input sisi: ");
			double sisi = scan.nextInt();scan.nextLine();
			Persegi p = new Persegi(sisi);
			p.LuasPersegi();
			p.KelilingPersegi();

		} else if (choose == 2) {

			System.out.print("Input panjang: ");
			double panjang = scan.nextInt();scan.nextLine();
			System.out.print("Input tinggi: ");
			double tinggi = scan.nextInt();scan.nextLine();
			PersegiPanjang pp = new PersegiPanjang(panjang, tinggi);
			pp.LuasPersegiPanjang();
			pp.KelilingPersegiPanjang();

		} else if (choose == 3) {

			System.out.print("Input radius: ");
			double radius = scan.nextInt(); scan.nextLine();
			Lingkaran l = new Lingkaran(radius);
			l.LuasLingkaran();
			l.KelilingLingkaran();
			
		} else if (choose == 4) {

			System.out.print("Input alas: ");
			double alas = scan.nextInt(); scan.nextLine();
			System.out.print("Input tinggi: ");
			double tinggi = scan.nextInt(); scan.nextLine();
			Segitiga s = new Segitiga(alas, tinggi);
			s.LuasSegitiga();
			s.KelilingSegitiga();
			

		} else if (choose == 5) {

			System.out.print("Input sisi: ");
			double sisi = scan.nextInt();
			Kubus k = new Kubus(sisi);
			k.VolumeKubus();
			k.KelilingKubus();

		} else if (choose == 6) {

			System.out.print("Input panjang: ");
			double panjang = scan.nextInt();
			scan.nextLine();
			System.out.print("Input tinggi: ");
			double tinggi = scan.nextInt();
			scan.nextLine();
			System.out.print("Input lebar: ");
			double lebar = scan.nextInt();
			scan.nextLine();
			Balok b = new Balok(panjang, tinggi, lebar);
			b.VolumeBalok();
			b.KelilingBalok();
			
		} else if (choose == 7) {

			System.out.print("Input radius: ");
			double radius = scan.nextInt();
			Bola o = new Bola(radius);
			o.VolumeBola();
			o.KelilingBola();
		}

	}

	public static void main(String[] args) {
		new Main();

	}

}
