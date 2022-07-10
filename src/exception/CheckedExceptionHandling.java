package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionHandling {

	public static void main(String[] args)  {

		sampleMethod1();
		try {
			sampleMethod2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("In main method after call");

	}

	public static void sampleMethod1()   {
		System.out.println("Inside sample Method 1");

		File f = new File("C:\\Users\\91992\\DE21\\DE21COreJava\\Java DOc.pdf");

		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {

       System.out.println("Provided file is not found.. please check");
			e.printStackTrace();
		}

		System.out.println("After file not found exception");
	}

	public static void sampleMethod2() throws ClassNotFoundException  {
		System.out.println("Inside sample Method 2");

		Class.forName("exception.UncheckedExceptionuuu");

		System.out.println("After class not found found exception");
	}

	public static void sampleMethod3() throws SQLException {
		System.out.println("Inside sample Method 2");

		DriverManager.getConnection("127.23.345.34", "root", "KHFGFGFJSFH123");

		System.out.println("After SQL exception exception");

	}




}
