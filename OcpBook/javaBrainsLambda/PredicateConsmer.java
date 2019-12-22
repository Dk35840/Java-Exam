import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Person{
	private String f;
	private int a;
	private String l;
	
	Person(String f, String l, int a){
		this.f=f;
		this.l=l;
		this.a=a;
		
	}
	
	public String getLastName(){
		return this.l;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.f;
	}
	
	public String toString() {
		
		return this.f+" "+this.l+" " +this.a;
		
	}
}

public class PredicateConsmer {
/*
 * perdicate and consumer are just functional interface that are added in java 8
 * predicate take a generic object and return boolean 
 * while conumer take a object and return nothing 
 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> people=Arrays.asList(
				new Person("avbab","afdwsf",34),
				new Person("bavbab","bfdwsf",34),
				new Person("cavbab","cfdwsf",34),
				new Person("eavbab","efdwsf",34),
				new Person("davbab","dfdwsf",34)
				);
		// for sorting		
		Collections.sort(people, (p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
		
		// for all method print
		performCond(people,p->true ,p -> System.out.println(p));
		
		// perform for priniting first and last name with c
		
		performCond(people, p->p.getLastName().startsWith("c"),p -> System.out.println(p));
		
		performCond(people,p->p.getFirstName().startsWith("c"), p->System.out.println(p.getFirstName()));
	
	}

	
	
	
	private static void performCond(List<Person> people,Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p:people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
		
	}

}
