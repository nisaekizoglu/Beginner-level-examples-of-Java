package baslangicSeviyeSorular;
import java.util.Scanner;
public class sifirGirileneKadarSayilarinToplami {
	
	//klavyeden 0 girilene kadar sayıların toplamını yazdıran kodu yazınız.

	public static void main(String[] args) {
		int toplam = 0;
		int sayi = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("TOPLAMAK ISTEDIGINIZ SAYIYI GIRINIZ: ");
			sayi = scanner.nextInt();
			toplam += sayi;
		} while (sayi != 0);

		System.out.println("SAYILARIN TOPLAMI: " + toplam);

}
