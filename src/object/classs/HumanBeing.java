package object.classs;

public class HumanBeing {
	
	String name;
	int age = 18;
	float height;
	
	
	public static void humenBeingEatsFood()
	{
		System.out.println("humen Being Eats Food");
	}

	public static void humanBeingWatchTV()
	{
		System.out.println("human Being Watch TV");
	}	

	
	public static void main(String[] args) {		
		
		byte pq = 8;		
		
		HumanBeing obj = new HumanBeing();
		
		HumanBeing obj1 = new HumanBeing();
		HumanBeing obj2 = obj;
		
		
		obj1.humanBeingWatchTV();
		obj1.humenBeingEatsFood();
		
		System.out.println(obj.age);
		
		obj.name = "Ganesh";
		obj.age = 15;
		obj.height = 6;
		
		obj1.name = "Amit";
		obj1.age = 55;
		obj1.height = 5;
		
		String str = obj1.name;
		System.out.println(str);
		
		int aa = obj1.age;
		System.out.println(aa);
		System.out.println(obj1.height);
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.height);
		
		obj1.age = obj.age;
		
		obj.humanBeingWatchTV();
		
		
	}
	
}
