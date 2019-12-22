package mB1.ch2_dpattern;

public class Singleton {
/*three instance of a class
 * 1>create a static instance
 * 2>construtor must be private for creating object
 * 3>pulic method for getting instance 
 * example where it is use->
 * 
 */
	public static void main(String[] args) {
		// by this way we can get single instance of a class
		Abc obj= Abc.getInstance();
		System.out.println(obj.a);
	}

}



class Abc{
	
	static Abc obj = new Abc();
	int a=5;
	private Abc() {
		//this.a=4;
	}
	
	public static Abc getInstance(){ // method name is anything
		
		return obj;
	}
}
