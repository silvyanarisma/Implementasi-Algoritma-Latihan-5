import java.util.Scanner;

public class MenghitungHari {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int bulan = input.nextInt();
		int tahun = input.nextInt();
		int hari = 0;
		String namaBulan = "";
	
		switch (bulan) {
			case 1 : 
				namaBulan = "Januari";
				hari = 31;
				System.out.println(namaBulan + " " + tahun + " memiliki " + hari + " hari");
			break;
			case 3 :
				namaBulan = "Maret";
				hari = 31;
				System.out.println(namaBulan + " " + tahun + " memiliki " + hari + " hari");
			break;
			case 5 :
				namaBulan = "Mei";
				hari = 31;
				System.out.println(namaBulan + " " + tahun + " memiliki " + hari + " hari");
			break;
			case 7 :
				namaBulan = "Juli";
				hari = 31;
				System.out.println(namaBulan + " " + tahun + " memiliki " + hari + " hari");
			break;
			case 8 :
				namaBulan = "Agustus";
				hari = 31;
				System.out.println(namaBulan + " " + tahun + " memiliki " + hari + " hari");
			break;
			case 10 :
				namaBulan = "Oktober";
				hari = 31;
				System.out.println(namaBulan + " " + tahun + " memiliki " + hari + " hari");
			break;
			case 12 :
				namaBulan = "Desember";
				hari = 31;
				System.out.println(namaBulan + " " + tahun + " memiliki " + hari + " hari");
			break;
			case 4 :
				namaBulan = "April";
				hari = 30;
				System.out.println(namaBulan + " " + tahun + " memiliki " + hari + " hari");
			break;
			case 6 :
				namaBulan = "Juni";
				hari = 30;
				System.out.println(namaBulan + " " + tahun + " memiliki " + hari + " hari");
			break;
			case 9 :
				namaBulan = "September";
				hari = 30;
				System.out.println(namaBulan + " " + tahun + " memiliki " + hari + " hari");
			break;
			case 11 :
				namaBulan = "November";
				hari = 30;
				System.out.println(namaBulan + " " + tahun + " memiliki " + hari + " hari");
			break;
			case 2 :
				if ((tahun % 4 == 0) && !(tahun % 100 == 0)) {
					namaBulan = "Februari";
					hari = 29;
				}else {
					namaBulan = "Februari";
					hari = 28;
				}
				System.out.println(namaBulan + " " + tahun + " memiliki " + hari + " hari");
			break;
			default :
				System.out.println("Inputan tidak valid");
		}
		
	}
}