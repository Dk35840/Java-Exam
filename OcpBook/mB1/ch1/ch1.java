package mB1.ch1;

import java.util.ArrayList;
/*
 * member inner class
 * local inner class
 * anonymous inner class
 * static nested class
 */

// main class
public class ch1 {

	// if we call object it print it or override it
	// if it is not present thenit address is run
	public String toString() {
		return "dhananjay print";
	}

	// implements of interface
	interface interfaces {

	}

	// an enum can implements but they can not extends
	enum myEnum implements interfaces {
	}

	// all enums implicitly extend java.lang.Enum
	// since a class can extend can only one parent class therefore they can not
	// extend another

	enum Season // extends Season11 //we cannot extends enum it givs error
	{
		// since enum are constant so use uppercase letter convention
		// semicolon are optioanls
		WINTER, SUMMER, FALL, SPRING

	}

	enum Season11 {

		// semicolon are optioanls
		WINTER, SUMMER, FALL, SPRING;
	}

	enum Season2 {
		// adding constructors, fields and methods
		WINTER("Low"), SPRING("medium"), SUMMER("High");

		private String expV;

		// adding constructor
		private Season2(String expV) {
			this.expV = expV;
		}

		// print
		public void pev() {
			System.out.println(expV);
		}

	}

	// 23 novem
	enum OnlyOne {
		Once(false);

		private OnlyOne(boolean b) {
			System.out.println("construtor runnning");
		}
	}

	// enum with methods
	public enum Season4 {
		WINTER {
			public void printHours() {
				System.out.println("9am-3pm");
			}
		},
		SPRING {
			public void printHours() {
				System.out.println("9am-5pm");
			}
		},
		SUMMER {
			public void printHours() {
				System.out.println("9am-7pm");
			}
		},
		FALL {
			public void printHours() {
				System.out.println("9am-5pm");
			}
		};
		public abstract void printHours();
	}

	// q 18
	enum AnimalClasses {
		MAMMAL {
			@Override
			public boolean hasFins() {
				// TODO Auto-generated method stub
				return false;
			}
		},
		FISH {
			public boolean hasFins() {
				return true;
			}
		},
		//BIRD, REPTILE, AMPHIBIAN, INVERTEBRATE
		;
		public abstract boolean hasFins();
	}

	public static void main(String[] args) {
		
	    //	System.out.println(new ArrayList());
		//	System.out.println(new String[0]);
			System.out.println(new String("my own example"));
			
			// creating own new object method
			 ch1 ch= new ch1();
			System.out.println(ch);
			
			/*
			 * methods in Enum(5)   Static values(), Static valueOf(), name(),ordinal(), compareTo()
			 */
		    // using enum study
			Season s=Season.SPRING;
			System.out.println(s);
			
			// loop in enum
			for(Season s1: Season.values()) {
				System.out.println(s1.name()+" "+s1.ordinal());
			}
			
			if(Season.SUMMER.ordinal()==1)
				System.out.println(true);  // true is primitive so it is compile and run
			
			
			// 2 method it throws the runtime error as not found
			Season s2=Season.valueOf("SUMMER");
			System.out.println(s2);
			
			// 23 nov
			OnlyOne firstCall = OnlyOne.Once ;
			OnlyOne firstCalls = OnlyOne.Once ;
			System.out.println(OnlyOne.Once.ordinal());
			System.out.println(OnlyOne.Once.values());
			System.out.println(OnlyOne.Once.name());
			System.out.println(OnlyOne.valueOf("Once"));
			
			
			// ques 18
			System.out.println(AnimalClasses.FISH);
			System.out.println(AnimalClasses.FISH.ordinal());
			System.out.println(AnimalClasses.FISH.hasFins());
			Season4.FALL.printHours();
	}

}
