package Unit_03;
import java.io.IOException;
import java.util.InputMismatchException;
public class sample {
	public static void main(String[] args) {
		try {
			int a = 100/0;
			System.out.println("a is :"+a);
		}
		
		catch( InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		catch( Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done");
		finally {//if there is no exception still finally would always run and if there is exception finally would run
			System.out.println("Done");
		}//if there is exception in try block but there is no catch block still finally would run
		
	}
}
