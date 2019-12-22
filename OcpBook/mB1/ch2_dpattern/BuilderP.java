package mB1.ch2_dpattern;
/*
 * following design pattern leads to:-
 * > more logical code
 * > classes that are easier to reuse
 * >code that are easier to maintain
 */
public class BuilderP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Phone p= new Phone("android",2,"qual",5,3100);
		 System.out.println(p);
		 
		 Phone p2= new PhoneBuilder2().setOS("android").setRam(4).setPr("qual").getPhone();
		 System.out.println(p2);
	}

}

class Phone{
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	public Phone(String os, int ram ,String processor, double ScreenSize, int battery) {
		this.os=os;
		this.ram=ram;
		this.screenSize=screenSize;
		this.battery=battery;
		this.processor=processor;
		
	}
	
	public String toString() {
		return "phone os "+this.os+"; ram "+this.ram+" battery :"+this.battery+" ; processor:"  +  this.processor;
	}
}

class PhoneBuilder2{
	private String os;
	private int ram;
	private String processor;
	private double ScreenSize;
	private int battery;
	
	public PhoneBuilder2 setOS(String os) {
		this.os=os;
		return this;
		
	}
	public PhoneBuilder2 setRam(int ram) {
		this.ram=ram;
		return this;
		
	}
	
	public PhoneBuilder2 setPr(String pr) {
		this.processor=pr;
		return this;
		
	}
	
	public Phone getPhone() {
		return new Phone(os,ram,processor, ScreenSize,  battery);
	}
	
	public String toString() {
		return "phone os "+this.os+"; ram "+this.ram+"; processor:"+this.processor;
	}
}