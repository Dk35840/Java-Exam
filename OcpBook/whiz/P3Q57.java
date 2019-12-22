package whiz;

import java.util.Optional;
import java.util.stream.Stream;

public class P3Q57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          Optional<Object> ops = Stream.of("java","Exam","Oracle").findFirst().map(s->Optional.of("A")).map(s->Optional.of("A"));
          Optional<String> opsFlatmap = Stream.of("java","Exam","Oracle").findFirst().flatMap(s->Optional.of("A"));
          System.out.println(ops);  
          System.out.println(opsFlatmap);  

	}

}

// here after findfirst() we use optional methods

//map
//If a value is present, apply the provided mapping function to it,and if the result is non-null,
//return an Optional describing theresult. Otherwise return an empty Optional.

//flatmap
//provided mapper is one whose result is already an Optional,
//and if invoked, flatMap does not wrap it with an additional Optional