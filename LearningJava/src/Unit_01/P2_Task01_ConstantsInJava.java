package Unit_01;
//constant can never be change once a value is assigned.
public class P2_Task01_ConstantsInJava {
  public static final double pi = 3.14;
	//pi = 3.18;
	public static void main(String[] args) {
		System.out.println(pi);
		main("askbdfhksd");
		
		NewClass obj = new NewClass();
		obj.add(1, 2);
		//P2_Task02_ConstantsInJava obj1 = new P2_Task02_ConstantsInJava();
		//obj1.add(2, 2);
		add(4,7);
		
	}
	
	public static void main(String args) {
		System.out.println(pi);
	}
	
	static void add(int a,int b) {
		System.out.println(a+b);
		System.out.println(pi);
	}
}

class NewClass{
	//final double pi = 3.14;
	void add(int a,int b) {
		System.out.println(a+b);
		System.out.println(P2_Task02_ConstantsInJava.pi);
      }
}