package baslangicSeviyeSorular;
import java.util.Scanner;
public class buyukKarekterleriSilme {
	//klavyeden girilen stringteki büyük karakterleri silip 
	//küçükkarakterleri birleştiren java kodunu yazınız.
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Bir string giriniz: ");
		String kelime = scanner.next();
		String yeniKelime = ""; 
		for(int i = 0; i < kelime.length(); i++) {
			if(kelime.charAt(i) >= 'a' && kelime.charAt(i) <= 'z') {
				yeniKelime += kelime.charAt(i);
			}
			
		}
		System.out.println("Sadece kucuk karakterler: " +yeniKelime);
	}

}
