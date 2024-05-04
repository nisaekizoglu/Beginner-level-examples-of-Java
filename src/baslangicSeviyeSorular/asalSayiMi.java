package baslangicSeviyeSorular;

import java.util.Scanner;

public class asalSayiMi {
	// klavyeden girilen sayı asal sayı mı kontrol eden java kodunu yazınız.
	public static void main(String[] args) {
		int number;
		boolean bolen = true;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = k.nextInt();
		if (number <= 1) {
			bolen = false;
		} else {

			for (int i = 2; i <= number / 2; i++) {
				if ((number % i) == 0) {
					bolen = false;
					break;
				}
			}
		}
		if (bolen) {
			System.out.println(number + " bir asal sayıdır.");
		} else {
			System.out.println(number + " bir asal sayı değildir.");
		}
	}

}
