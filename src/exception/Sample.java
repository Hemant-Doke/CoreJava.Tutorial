package exception;

public class Sample {

	int a = 90;
	
	public static void main(String[] args) {
		int z = getIntValue();
		System.out.println(z);
	}

	public void sampleMethod() {
		System.out.println("Hello");
	}
	
	public static  int getIntValue()
	{
		
		try {
			return 3;
		} catch (Exception e) {
			return 6;
		}
		finally {
			return 8;
		}
	}

}
