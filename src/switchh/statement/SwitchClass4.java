package switchh.statement;

import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public class SwitchClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String bookName = "English";
		
		int std = 11;
		
		getBookPrice("Math", 12);
		getBookPrice("Science", 11);
		getBookPrice("English", 12);
		

	}
	
	
	public static void getBookPrice(String bookName, int std)
	{
switch (bookName) {
		
		case "Math":
					
			switch (std) {
			case 11:
				System.out.println("Math book price is = 320");
				break;
			case 12:
				System.out.println("Math book price is = 350");
				break;

			default:
				System.out.println("Math book for other std is not avilable");
				break;
			}
			
			break;
		case "Science":
			
			switch (std) {
			case 11:
				System.out.println("Science book price is = 3200");
				break;
			case 12:
				System.out.println("Science book price is = 3300");
				break;

			default:
				System.out.println("Math book for other std is not avilable");
				break;
			}
			
			break;
		case "English":
			
			
			switch (std) {
			case 11:
				System.out.println("English book price is = 150");
				break;
			case 12:
				System.out.println("English book price is = 170");
				break;

			default:
				System.out.println("Math book for other std is not avilable");
				break;
			}
			
			break;
			
		default:
			System.out.println("Sorry book is not available...");
			break;
			
		}
		
	}

}
