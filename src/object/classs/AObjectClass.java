package object.classs;

public class AObjectClass {

	public static void main(String[] args) {

        HumanBeing oo = new HumanBeing();
		ArithMaticCalculations obj = new ArithMaticCalculations();
		oo.age = 90;
		
		obj.a = 90;
		obj.b = 99;
		System.out.println(obj.b);
		
		obj.addition();
		obj.substraction();
		oo.name = "ANCV";
		
		

	}

}
