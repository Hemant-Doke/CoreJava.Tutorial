package collection.packagee;

public class Sample {

	public static void main(String[] args) {
		
		
		String str = "    Welcome to KTCTC with some number 2324234    ";
		
		int ff = Integer.parseInt(str.trim().split(" ")[6].toLowerCase().split("24")[1]);
		System.out.println(ff);
		
		 Student st1 = new Student(2, "Amit");	
			Student st2 = new Student(3, "Amol");
			
			st1.displayeStudentInfo();
			new Student(33, "GGGGG").displayeStudentInfo();
			

	}

}
