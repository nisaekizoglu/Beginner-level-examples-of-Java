package baslangicSeviyeSorular;
import java.util.Scanner;

public class enBuyukSayi {
	//klavyeden girilen 10 sayıdan en büyüğünü ekrana yazdırın.
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi = 0;
		int max = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Bir sayi giriniz: ");
			sayi = scanner.nextInt();
			if (max < sayi) {
				max = sayi;
			}
		}
		System.out.println("En büyük sayi: " + max);
  }



}
