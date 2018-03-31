package LearnRegEx;

public class Static {
	//Static keyword in Variable
	 int counter=0;
	 static int  count =0;
           
	public static void main(String[] args) {
		Static obj1 = new Static();
		obj1.getCount();
		getCounter();
		
	}

	public void getCount() {
		count++;
		counter++;
		System.out.println("Static :"+count);
		System.out.println("Non-Static "+counter);
	}
	public static void getCounter() {
		count++;
		Static obj = new Static();
		obj.counter++;
		
		System.out.println("Static :"+count);
		System.out.println("Non-Static :"+obj.counter);
		obj.getCount();
	}


}
