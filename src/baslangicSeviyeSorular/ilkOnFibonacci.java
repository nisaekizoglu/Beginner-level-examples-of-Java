package baslangicSeviyeSorular;

public class ilkOnFibonacci {
	//ilk 10 fibonacci sayısını ekrana yazdıran java kodunu yazınız.
	
	public static void main(String[]args) {
		int a=1, b=1;
		int c;
		for(int i=3; i<=10; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
