package baslangicSeviyeSorular;

public class integralHesaplama {
	//0 dan 3 e xkare dx integralini hesaplayan kodu yazınız.
	public static void main(String[]args) {
		double a=1.0, b=2.0, h=0.001, alan=0.0, f1,f2;
		f1=a*a;
		for( double i=a+h; i<b; i=i+h) {
			f2=i*i;
			alan=alan+(f1+f2)*h/2;
			f1=f2;
		}
		System.out.println(alan);
	}

}
