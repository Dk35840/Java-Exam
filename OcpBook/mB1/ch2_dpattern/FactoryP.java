package mB1.ch2_dpattern;

public class FactoryP {

	public static void main(String[] args) {
		Os obj1 = new Android();
		obj1.spec();
		
		
		OperatingSystemFactory osf= new OperatingSystemFactory();
		Os obj2=osf.getInstance("open");
		obj2.spec();

	}

}


interface Os{
	public void spec();
	
}


 class Android implements Os{
	
	public void spec() {
		System.out.println("most poweful spec");
	}
}
 
 class Iphone implements Os{
		
		public void spec() {
			System.out.println("most secured os");
		}
	}
 
 
 class Windows implements Os{
		
	public void spec() {
		System.out.println("most window os");
	}
}
 
 class OperatingSystemFactory{
	 public Os getInstance(String str) {
		 if(str.equals("Open"))
			 return new Android();
		 if(str.equals("closed"))
			 return new Iphone();
		 else 
			 return new Windows();
	 }
 }
 