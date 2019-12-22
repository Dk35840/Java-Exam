package vekant_s;


	interface Say{
		void say();
	}
	
	interface Say2{
		Message getMessage(String msg);  
	}
	class Message{
		Message(String s){
			System.out.println(s);
		}
	}
	
	// class start from  here
public class MerhodReference {
	
	public static void Method1(){
		System.out.println("this is static method");
	}
	
	public void Method2(){  
        System.out.println("Hello, this is non-static method.");  
    }  
	
	
	public static void main(String...strings)
	{
		// method refrence using the static method
		
		// the target must be functional interface so it is wrong type
		//MerhodReference mr= MerhodReference::Mehod1;
		
		Say mr1= MerhodReference::Method1;
		mr1.say();
		
		
		
		// refrence to an instance method
		MerhodReference mr= new MerhodReference();
		Say mr2= mr::Method2;
		mr2.say();
		// instance method using the anonymous object
		Say say3= new MerhodReference()::Method2;
		say3.say();
		
		
		//3 refrence to the constructor
		//You can refer a constructor by using the new keyword
		
		Say2 mr8= Message::new;  
		mr8.getMessage("Hello");  
	
	}
}
