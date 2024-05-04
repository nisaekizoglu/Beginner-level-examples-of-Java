package baslangicSeviyeSorular;

public class stringdekiKelimeSayisi {
	//yazılmış olan cümlede kaç kelime vardır?
	
	public static void main(String[]args) {
		String str= "Ankara    Türkiyenin başkentidir.";
		int bos=0;
		int top=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				top+=1;
				if(str.charAt(i+1)==' ') {
					top=top-1;
				}
				
			}
		}
		System.out.println(top+1);
	}

}
