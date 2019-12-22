package whiz;


import java.util.ArrayList;
import java.util.List;

public class P1Q1 {

	public static void main(String[] args) {
		// printint private variable from local class
		System.out.println(new P1Q1().new A().a);
		
		// private from another class does not define
	//	System.out.println(new B1().a);
		
		for(int i=0;i<10;i++) {
			class A1{
				public A1() {
					System.out.println("a1");
				}
			}
			
			
			
		}
		if(true) {
			class A1{
				public A1() {
					System.out.println("a1");
				}
			}
		}
		
		List<Integer> a = new ArrayList<>();
		
		a.add(4);
		a.add(41);
		a.stream().mapToInt(i->i).filter(e->e>3).count();
		System.out.println(a);
		
		
		
	}
	
	class A{
		private int a=2;
	}

}

class B1{
	private int a=2;
}