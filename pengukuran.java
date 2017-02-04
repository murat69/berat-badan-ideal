import app.rumus;
import app.pria;
import app.wanita;
import java.util.Scanner;

class pengukuran{
	public static void main(String[] args) {

		Scanner ketik = new Scanner(System.in);

		double tinggi,berat;
		System.out.print("masukan tinngi anda (meter)");
		tinggi = ketik.nextDouble();
		System.out.print("masukan berat anda (kg)");
		berat = ketik.nextDouble();
		System.out.print("masukan jenis kelamin anda (1)pria (2)wanita ");
		int jenis = ketik.nextInt();

		rumus hitung = new rumus();
		double hasil = hitung.pengukuran(tinggi, berat);

		if(jenis == 1){
			pria.keterangan(hasil);

		}else if (jenis == 2) {
			wanita.keterangan(hasil);
		}else{
			System.out.print("kamu pulang aja");
		}
	}
}