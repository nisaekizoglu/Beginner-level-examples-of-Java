package baslangicSeviyeSorular;
import java.util.Scanner;
public class stringiTerstenYazma {
	//klavyeden girilen stringi tersten yazdıran java kodu.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string:");
		String kelime ;
		String ters=" ";
		kelime = scanner.nextLine();
		for (int i = kelime.length()-1 ; i >= 0; i--) {
			ters += kelime.charAt(i);
		}
		System.out.print("Reverse string:" +ters);
	}

}
