package baslangicSeviyeSorular;
import java.util.Scanner;
public class palindromMu {
	//klavyeden girilen string palindrom mu kontrol eden java kodunu yazınız.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir string giriniz: ");
		String kelime = scanner.next();
		boolean palindrom = true;
		for (int i = 0; i < kelime.length() / 2; i++) {
			if (kelime.charAt(i) != kelime.charAt(kelime.length() - 1 - i)) {
				palindrom = false;
				break;
			}
		}
		if (palindrom) {
			System.out.println("Girilen string palindromdur.");
		} else {
			System.out.println("Girilen string palindrom değildir.");
		}

	}

}
