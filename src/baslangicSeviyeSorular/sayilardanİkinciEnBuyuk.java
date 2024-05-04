package baslangicSeviyeSorular;
import java.util.Scanner;
public class sayilardanİkinciEnBuyuk {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi = 0;
		int max = 0;
		int enb2 = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Bir sayi giriniz: ");
			sayi = scanner.nextInt();
			if (max < sayi) {
				enb2 = max;
				max = sayi;
			} else if (sayi > enb2 && sayi != max) {
				enb2 = sayi;
			}
		}
		System.out.println("En büyük ikinci sayi: " + enb2);
	}

}
