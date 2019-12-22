package ch1;
interface dk{
	
}

class HeavyAnimal{
	
}
interface Mother {}
class dau implements Mother{}

class Hippo extends HeavyAnimal { }


public class Ques14 {
	 public static void main(String...strings) {
		 HeavyAnimal h = new Hippo();
		 Mother m = new dau();
		 
		 
		 System.out.println(h instanceof Mother);
		 
		 // does not compile type error
		 // if dau is interfacae than it give the false rather than error as in above program
		 //System.out.println(h instanceof dau);
		 
		 
		 System.out.println(m instanceof HeavyAnimal);
	 }
}

