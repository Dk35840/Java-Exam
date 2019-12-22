package mB2.ch7.someU;


public class RunnableExample {

	public static void main(String[] args) {
		// for more annymous interaface
		//https://www.geeksforgeeks.org/anonymous-inner-class-java/

		
		Thread myLambdaThread= new Thread(()->System.out.println("thread is ruuning"));
		
		myLambdaThread.start();
	}

}
