package mB1.ch1;

abstract interface CanSwim {
	public void swim();
}

public class Prac2Q37 {

public static void main(String[] seaweed) {
int distance = 7;
CanSwim seaTurtle = new CanSwim(){

	@Override
	public void swim() {
		System.out.print(distance);
	}
};


seaTurtle.swim();}
}