package parameterized.methods;

public class ParaMethodClass2 {

	public static void main(String[] args) {
		
		int z=89;
		StData obj = new StData();		
		
		obj.rollNum=22;
		obj.name = "Ajay";
		
		obj.displayStudentInfo();
		
		ParaMethodClass2 obj1 = new ParaMethodClass2();
		
		obj1.getStudentInfo(obj);		
		
		obj1.sm(z);
		
		
		
	}
	
	
	public void getStudentInfo(StData oo)
	{
		oo.name = "Sanjay";
		oo.displayStudentInfo();
		
	}
	
	public void sm(int a)
	{
		System.out.println("sdfdsfs");
	}
	
	
	
	

	
	
}
