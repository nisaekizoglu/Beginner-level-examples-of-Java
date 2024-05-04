package baslangicSeviyeSorular;

public class sayiKacBasamakli {
	// klavyeden girilen sayı kaç basamaklı

	public static void main(String[] args) {
		int sayi = 1791;
		int bas = 1;
		while (sayi >= 10) {
			sayi = sayi / 10;
			bas++;
		}
		System.out.println("basamak sayisi: " + bas);
	}

}
