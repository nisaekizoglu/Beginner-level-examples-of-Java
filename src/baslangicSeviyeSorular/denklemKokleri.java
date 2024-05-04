package baslangicSeviyeSorular;

public class denklemKokleri {
	//klavyeden girilen 2. derece denklemin köklerini hesaplayan programı yazınız
	
	public static void main(String[]args) {
		int a,b,c;
		double x1,x2,delta;
		a=1;
		b=3;
		c=6;
		delta=(b*b)-4*a*c;
		if(delta<0) {
			System.out.println("KOK YOKTUR.");
			
		}else if(delta==0){
			x1= -b/2*a;
			x2= x1;
					System.out.println(x1);
		}else {
			x1=(-b +Math.sqrt(delta))/(2*a);
			x2=(-b -Math.sqrt(delta))/(2*a);
			System.out.println();
		}
		
		
	}


}
