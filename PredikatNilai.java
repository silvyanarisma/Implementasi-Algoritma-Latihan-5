import java.util.Scanner;

public class PredikatNilai {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		char huruf = input.next().charAt(0);
		String predikat = "";
		
		switch (huruf) {
			case 'A' : System.out.println("Excellent");	
			break;
			case 'B' : System.out.println("Good");
			break;
			case 'C' : System.out.println("Average");
			break;
			case 'D' : System.out.println("Failed");
			default :
		}
	}
}
