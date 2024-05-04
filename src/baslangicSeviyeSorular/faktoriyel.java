package baslangicSeviyeSorular;

import java.util.Scanner;

public class faktoriyel {
	
	//klavyeden girilen sayıların faktöriyelini hesaplayan kodu yazınız.
	
	public static void main(String []args) {
		Scanner k=new Scanner (System.in);
		int sayi;
		System.out.print("Enter the number: ");
		sayi=k.nextInt();
		
		int faktoriyel=1;
		for(int i=1; i<=sayi; i++) {
			faktoriyel*=i;
		}
		System.out.println("Number's factorial: "+faktoriyel);
	}

}
