package baslangicSeviyeSorular;
import java.util.Scanner;

public class kucukBuyukHarfDegistirme {
	//girilen stringin küçük harflerini büyük büyük harflerini küçüğe çeviren kodu yazınız.
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String str= "";
		System.out.println("Bir string giriniz: ");
		String kelime = scanner.next();
		
		for (int i=0; i<kelime.length(); i++) {
			if (kelime.charAt(i) <= 'z' && kelime.charAt(i) >= 'a') {
				str += (char)(kelime.charAt(i)-32);
			}else {
				str += (char)(kelime.charAt(i)+32);
			}
		}
		System.out.println(str);
	}

}
