package mB1.ch1;

public class ch3 {

	// innerclass are of four types
	
	// STATIC inner class
			static class Innerclass1 extends ch3{
				
				
			}
			
			
	// NON STATIC inner class
			class Innerclass2 extends ch3{
				
				// innerclass cannot contain the static members
				//static int x=3;
			}
			
	// LOCAL class
			
			void local() {
				class Inneclass3 extends ch3{
					
				}
			}
	// ANONYMOUS inner class that extends outer class 
			ch3 ch=new ch3() {
				void process() {
					// innerclass had does not any name
				}
			};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// calling first innerclass
		ch3.Innerclass1 inc1= new ch3.Innerclass1();
		
		
	}

}
