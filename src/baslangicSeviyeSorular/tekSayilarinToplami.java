package baslangicSeviyeSorular;

public class tekSayilarinToplami {
	// 0-100 arası tek sayıların toplamını yazdıran kodu yazınız.
	public static void main(String[] args) {
		int top = 0;
		for (int i = 1; i <= 100; i = i + 2) {
			top = top + i;
		}
		System.out.println(top);
	}
}
