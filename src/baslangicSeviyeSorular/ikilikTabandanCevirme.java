package baslangicSeviyeSorular;

import java.util.Scanner;

public class ikilikTabandanCevirme {
	//klavyeden 10 basamaklı ikilik tabandaki sayının en anlamsız kısmından itibaren sayi giriliyor. bu sayının 
		//onluk tabandaki degerini hesaplayınız.
		
		public static void main(String[]args) {
			String number; 
			int decimal = 0;
			Scanner k= new Scanner(System.in);
			System.out.println("Enter 10 digit number:");
			number = k.next();
			String digit = "" ;
			System.out.println("Number of normal:");
			for (int i = number.length() - 1; i >= 0; i--) {
				digit += number.charAt(i);
				
			}
			System.out.println(digit);
			for (int i = digit.length()-1; i >= 0; i--) {
		            if (digit.charAt(i) == '1') {
		                decimal += Math.pow(2, i);
		            }
		        }
			 System.out.println("Decimal value: " + decimal);
		}


	}

	/*int top = 0;
	 * for (int i = 0; i < dizi.length; i++){
	 * top = top + dizi[9-i] * Math.pow(2,i);
	 */

}
