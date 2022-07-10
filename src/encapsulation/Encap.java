package encapsulation;

public class Encap {
	
	private int a;
	private String name;	
	private float abc;
		
	public void setA(int a)
	{
		if (a<0)
		{
			this.a = 0;
		}
		else
		{
			this.a = a;
		}
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAbc() {
		return abc;
	}

	public void setAbc(float abc) {
		
		if (abc<0)
		{
			this.abc = 0;
		}
		else if (abc>100)
		{
			this.abc = 100;
		}
		else
		{
			this.abc = abc;
		}
		
		
	}

	public int getA()
	{
		return this.a;
	}
	
	

}
