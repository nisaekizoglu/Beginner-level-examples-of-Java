package baslangicSeviyeSorular;
import java.util.Scanner;
public class kucukHarfSayisi {
	
	//girilen stringteki küçük harflerin sayısını bulanjava kodunu yazınız.

	public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
		System.out.println("String giriniz: ");
		int sayac = 0;
		String kelime = scanner.next();
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) >= 'a' && kelime.charAt(i) <= 'z') {
				sayac++;
			}

		}
		System.out.println("Girilen stringteki kücük harf sayisi: " + sayac);

	}         

}
