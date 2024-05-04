package baslangicSeviyeSorular;
import java.util.Scanner;
public class siraliMi {
	
	//klavyeden girilen 10 sayı sıralı mı değil mi kontrol eden kodu yazınız.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi;
		int max = 0;
		boolean sirali = true;

		for (int i = 0; i < 10; i++) {
			System.out.println("Bir sayi giriniz: ");
			sayi = scanner.nextInt();
			if (sayi < max && i > 0) {
				sirali = false;
			}
			max = sayi;
		}
		if (sirali) {
			System.out.println("Girilen sayılar sıralıdır.");
		} else {
			System.out.println("Girilen sayılar sıralı değildir.");
		}

	}

}
