package app;

public  class wanita{

		public static void keterangan(double hasil){
		if ( hasil < 18) {
			System.out.println("anda kurang berat badan");
		}else if(hasil < 25){
			System.out.println("anda normal");
		}else if (hasil > 27) {
			System.out.println("anda kelebihan berat badan");
		}else{
			System.out.println("segera lakukan program penurunan badan");
			
		}
	}
}