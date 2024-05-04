package baslangicSeviyeSorular;

import java.util.Scanner;

public class aUzerib {
	//klavyeden girilen a b sayısı için a üzeri b yi hesaplayan kodu yazınız

	public static void main(String[]args) {
		int sonuc=1;
		Scanner k = new Scanner(System.in) ;
		System.out.println("Tabanı giriniz:");
		int a=k.nextInt();
		System.out.println("Üssü giriniz:");
		int b=k.nextInt();
		for(int i=1; i<=b; i++) {
			sonuc= sonuc*a;
		}
		System.out.println("sonuc: "+sonuc);
		
	}

}
