package mB2.ch8;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromConsole {

	public static void main(String[] str) throws IOException {
		
		
		

	
		// older way for input value
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("enter the string");
				String userInput = reader.readLine();
				System.out.println("You entered the following: "+userInput);
	
	
	// new way of writing
				
	Console console = System.console();
	if (console == null) {
        System.out.println("No console: not in interactive mode!");
        System.exit(0);
    }

		System.out.println("enter the string2");
	String userInput1 = console.readLine("my name");
	console.writer().println ("You entered the following: "+userInput1);

	
}

}