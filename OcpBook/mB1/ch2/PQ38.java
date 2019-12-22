package mB1.ch2;

interface Toy {
	String play();
}

public class PQ38 {
	
	static int x = 11; 
    private int y = 33; 
    public void method1(int x) 
    { 
    	PQ38 t = new PQ38(); 
        this.x = 22; 
        x=55;
        y = 44; 
  
        System.out.println("Test.x: " + PQ38.x); 
        System.out.println("t.x: " + t.x); 
        System.out.println("t.y: " + t.y); 
        System.out.println("y: " + y); 
        System.out.println("y: " + this.y); 
    } 
	public static void main(String[] matrix) {
		PQ38 t = new PQ38(); 
        t.method1(5); 
		int a=4;
		abstract class Robot {
		}
		class Transformer extends Robot implements Toy {
			public String name = "GiantRobot";

			public String play() {
				return "DinosaurRobot";
			}
		}
		Transformer prime = new Transformer() {
			public String play() {
				return name;
			} // y1
		};
		// if it is public to kaha se utahyea , kuch to addres to hona hi hahiye na
		System.out.print(prime.play() + " "+new Transformer().name);
	}
}