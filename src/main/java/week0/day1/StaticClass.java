package week0.day1;

public class StaticClass {
	
	static String a = "Hello";
	  String b = "World";
	  
	  
	  public static void main(String[] args) {
	        method1();
	        StaticClass obj1 = new StaticClass();
	        obj1.method2();
		}
	
	public static  void  method1() {
		StaticClass obj = new StaticClass();
		System.out.println(a+" "+obj.b);
		
		 }
	
private void method2() {
		 System.out.println(a+" "+b);
	}


	
	

}
