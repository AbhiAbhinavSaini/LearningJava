package Unit_01;
/*
 * Variable in java is a data container that saves the data values during java program execution.
 * Types of variables:
 * - In java,there are 3 types of variables:
 *   Local variables:declared inside the body of a method
 *   
 *   Instance variable:Instance variables are defined without the Static keyword.
 *   -They are defined outside a method declaration.
 *   -They are object specific and are known as instance variables.
 *   
 *   Static Variables:static variables are defined with a static keyword.
 *   static variables are initialized only once,at the start of the program execution.
 *   these static variables should be initialized first,before the inintialization of any object.
 *   
 *   Data Types in Java?
 *   Refernce oneNote 
 */
public class P3_Task01_VariablesAndDataTypesInJava {
	static int q = 11;
	int p = 10;
	
	public static void main(String[] args) {
		//valid declaration
		int a,b,c;
		float pi;
		double d;
		char e;
		
		//valid initialization
		pi=3.14f;
		d=20.22d;
		e='v';
		

		   a = 10;
		   b = 10;
		   c = 10;
		   
		   System.out.println(a);
		   System.out.println(b);
		   System.out.println(c);
		   
		   System.out.println(pi);
		   System.out.println(d);
		   System.out.println(e);
		   
		   int myNum = 5 ; // Integer (Whole Number)
		   float myFloatNum = 5.99f ;// Floating Point Number
		   char myLetter = 'D'; //Character
		   boolean myBool = true; //Boolean
		   String myText = "Hello"; //String 
		   
		   System.out.println(myNum);
		   System.out.println(myFloatNum);
		   System.out.println(myLetter);
		   System.out.println(myBool);
		   System.out.println(myText);
		   
		   /* 
		    * Java Variables Type Conversion & Type Casting 
		    */
		   
		   double f;
		   int i = 10;
		   f = i ; // Type Conversion 
		   
		   double g;
		   int j = 10;
		   g = (int)j ; // Type Casting 
		   
		   System.out.println(f);
		   System.out.println(i);
		   System.out.println(g);
		   System.out.println(j);
		   
		   byte k = 10; // 1 byte
		   boolean l = true ; // 1 bit = true or false only 
		   long m =  10L;
		   float n = 1.2f;
		   double o = 1.2d;
		   
		   System.out.println(k);
		   System.out.println(l);
		   System.out.println(m);
		   System.out.println(n);
		   System.out.println(o);
		   
		   System.out.println(ABC1.j); //data functions / methods
		   //ABC.display();
		   
		   ABC1 obj1 = new ABC1();
		   System.out.println(obj1.i++);
		   System.out.println(obj1.i);
		   
		   ABC1 obj2 = new ABC1();
		   System.out.println(obj2.i);
		   
		   //System.out.println(obj1.j++);
		  // System.out.println(obj1.j);
		  //System.out.println(obj2.j);
		   
		   System.out.println(ABC1.j++);
		   System.out.println(ABC1.j);
		   
		   ABC1.typeConversionAndTypeCasting();
	}
	
	int r = 10;
	
	void display() {
		int a = 5;//local Variable
		System.out.println("This is display Method");
		System.out.println(a);
	}
	
}
class ABC1{

	static int j = 10;//class variable/static variable
	int i = 10;//instance variable
	
	static void display() {
		int a = 5;//local variable
		System.out.println("This is display method");
		System.out.println(a);
	}
	 static void typeConversionAndTypeCasting() {
		 /*
		  * double f;//8 bytes = 64 bits/slots int i=10;//4 bytes = 32bits/slots 
		  * f = i;// Type conversion system.out.println(f);
		  * 
		  * double g = 10;//64 int j;//32 j = (int)g;
		  */
		 
		 double f; //64 slots
		 int i =10; // 32 slots
		 f = i; // type conversion
		 System.out.println(f);
		 
		 double g=10; //64 slots
		 int j; // 32 slots1
		 j = (int)g; // type casting
		 System.out.println(i);
		 System.out.println(j);
	 }

}