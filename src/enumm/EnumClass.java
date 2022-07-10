package enumm;

public class EnumClass {

	enum week {
		sun, mon, tue, wed, thr, fri, sat
	}

	public enum weekDays {
		mon, tue, wed, thr, fri
	}

	public static void main(String[] args) {

		System.out.println(week.sun);
		System.out.println(weekDays.wed);
		week ab = week.sun;
		System.out.println(ab);
		System.out.println(yearsOfEngg.firstyear);
		

		for (week each : week.values()) {
			System.out.println(each);

		}

		weekDays wd = weekDays.thr;
		printDaysInfo(wd);

	}

	public static void printDaysInfo(weekDays ab) {
		switch (ab) {
		case mon:
			System.out.println("You have selected Monday");
			break;
		case tue:
			System.out.println("You have selected Tuesday");
			break;
		case wed:
			System.out.println("You have selected Wensday");
			break;
		case thr:
			System.out.println("You have selected Thersday");
			break;
		case fri:
			System.out.println("You have selected Friday");
			break;

		default:
			System.out.println("Invalid day");
			break;
		}

	}

}
