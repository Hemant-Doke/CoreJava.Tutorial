package wrapper;

public class WrapperClass2 {
	
	

	public static void main(String[] args) {
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.SIZE);
			
		
		String str = "45";
		byte a = 67;
		
	Byte bt = new Byte(a);
	
	byte vv = Byte.parseByte(str);
	System.out.println(vv);
	
	System.out.println(bt);
		
	byte bb = bt.byteValue();// unboxing
	
	byte cc = 78;
	
	Byte btc = Byte.valueOf(cc);// boxing
	

	
	

	}
	
	

}
