package baslangicSeviyeSorular;
import java.util.Scanner;
public class stringlerEsitMi {
	//Klavyeden girilen 5 karakterli iki stringin birbirine eşit olup
	//olmadığını kontrol eden java kodunu yazınız.
	

	public static void main(String[] args) {

		boolean esit = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("5 karakterli birinci stringi giriniz: ");
		String kelime1 = scanner.next();
		System.out.println("5 karakterli ikinci stringi giriniz: ");
		String kelime2 = scanner.next();
		if(kelime1.length() != 5 || kelime2.length() != 5) {
			System.out.println("Lütfen 5 karakterli giriniz.");
			System.exit(1);
		}
		for (int i = 0; i < 5; i++) {
			if (kelime1.charAt(i) != kelime2.charAt(i)) {
				esit = false;
				break;
			}
		}
		if (esit) {
			System.out.println("Girilen iki string birbirine esittir.");
		} else {
			System.out.println("Girilen iki string birbirine esit degildir.");
		}
	}
	

}
