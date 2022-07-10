package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {

		sampleMethod1();
		sampleMethod2();
		sampleMethod3();
		sampleMethod4();
		System.out.println("In main method after call");

	}

	public static void sampleMethod1() throws FileNotFoundException  {
		System.out.println("Inside sample Method 1");

		File f = new File("C:\\Users\\91992\\DE21\\DE21COreJava\\Java DOc.pdf");

		FileInputStream fis = new FileInputStream(f);

		System.out.println("After file not found exception");
	}

	public static void sampleMethod2() throws ClassNotFoundException  {
		System.out.println("Inside sample Method 2");

		Class.forName("exception.UncheckedException");

		System.out.println("After class not found found exception");
	}

	public static void sampleMethod3() throws SQLException {
		System.out.println("Inside sample Method 2");

		DriverManager.getConnection("127.23.345.34", "root", "KHFGFGFJSFH123");

		System.out.println("After SQL exception exception");

	}

	public static void sampleMethod4() throws SQLException, ClassNotFoundException, FileNotFoundException   {
		System.out.println("Inside sample Method 2");

		DriverManager.getConnection("127.23.345.34", "root", "KHFGFGFJSFH123");
		Class.forName("exception.UncheckedException");

		File f = new File("C:\\Users\\91992\\DE21\\DE21COreJava\\Java DOc.pdf");

		FileInputStream fis = new FileInputStream(f);

		System.out.println("After SQL exception exception");		
		
	}
	
	public static void sm()
	{
		System.out.println("dfsfsdfsdf");
	}

}
