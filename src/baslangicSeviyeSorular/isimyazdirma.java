package baslangicSeviyeSorular;

import java.util.Scanner;

public class isimyazdirma {
	// adınızı ekrana 10 kez yazdırın
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		String isim;
		System.out.println("ADINIZI VE SOYADINIZI GIRINIZ:");
		isim = k.nextLine();
		for (int i = 0; i < 10; i++) {
			System.out.println(isim);
		}
	}

}
