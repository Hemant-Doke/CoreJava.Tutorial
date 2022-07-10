package data.types;

public class DataTypesClass2 {

	public static void main(String[] args) {
		
		boolean flag = true;
		float fl = 67.54f;		
		short sh = 78;
		int in = 45;		
		fl = in;		
		in = fl;		
		in = sh;
		sh = in;
		flag = sh;
		sh = flag;		
		
		System.out.println("----------------------------");
		char chVeri = 'D';
		int a = chVeri;
		System.out.println(chVeri);
		System.out.println(a);
		chVeri = '5';		
		System.out.println(chVeri);	
		chVeri = 65;
		System.out.println(chVeri);		
		int z = '5';
		System.out.println(z);
		char ccc = 53;
		System.out.println(ccc);
		z = ccc;
		ccc = z;
		
		
		

	}

}
