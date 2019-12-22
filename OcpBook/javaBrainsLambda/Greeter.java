package javaBrainsLambda;

// compile javap Greeter.class
public class Greeter {
	
	
	public void classGreeter(Greeting g) {
		g.perform();
		
	}

	public static void main(String[] args) {
		
		Greeter g= new Greeter();
		
		// labda is not a way of shortcut for innerclass but it is another way for doing things
		Greeting lambdaGreetin=	()-> System.out.println("hw lambda greeting");
		
		// a shorter version
		findLength fl= s-> s.length();
		System.out.println(fl.findl("my length"));
		
		
		
		Greeting innerClassGreeting= new Greeting() {
			
			public void perform() {
				System.out.println("inner class greeting");
			}
		};
		
		// through direct
		innerClassGreeting.perform();
		lambdaGreetin.perform();

		System.out.println("greeting through class greeting :");
		// through class method
		g.classGreeter(lambdaGreetin);
		g.classGreeter(innerClassGreeting);
		
		
		
		
	}
	
	
	// lambda is not shortcut for innerclass is is another type

}
interface findLength{
	int findl(String s);
}

interface Greeting{
	
	void perform();
}