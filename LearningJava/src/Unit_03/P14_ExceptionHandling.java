package Unit_03;
import java.util.Scanner;
public class P14_ExceptionHandling {
	public static void main(String[] args) {
		ABCD1 obj= new ABCD1();
		//obj.basicException();
		//obj.handleException();
		//obj.multipleCatch();
		//obj.inputMismatchException();
		//obj.stackOverFlowError();
		obj.indexOutOfBoundException();
		obj.nullPointerException();
		//obj.useOfThrow();
		//obj.useOfThrows&Finally();
	}
}
class ABCD1{

	void basicException() {
		int b=0;
		int a=100/b;//jvm cannot evalute it
		System.out.println(a);//this programe is terminate because it is not handlet
	}
	void handleException() {
		try {
			int b=0;
			int a=100/b;
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done");
	}
	void multipleCatch() {
		try {
			int b=0;
			int a=100/b;
			System.out.println(a);
	}catch(ArithmeticException e) {
	 System.out.println(e.getMessage());
	}
		System.out.println("Done");
	}
	void inputMismatchException() {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter the number");;
			int a=sc.nextInt();
			System.out.println("Number enter by you"+a);
			sc.close();
		}catch(Exception e) {
			System.out.println("Wrong input");
		}
		 System.out.println("Done");
	}
	void stackOverFlowError(int i) {
		
	}
	void indexOutOfBoundException() {
		try {
			int arr[] = {1,2,3,4,5};
			arr[6] = 7;
		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			System.out.println("error handled");
		}
	System.out.println("Done");
	}
	void nullPointerException() {
		try {
		String str = null;
		System.out.println(str.length());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done");
	}
	/*	
	void useOfThrow() {
	}
	void useOfThrows&Finally() {
	}*/
}
	
