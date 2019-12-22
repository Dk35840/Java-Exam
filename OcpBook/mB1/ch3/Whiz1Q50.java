package mB1.ch3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Whiz1Q50 {
	public static void main(String[] str) {
		Stream<Client> clients = Stream.of(new Client("Will", "vpsserver", 200),
				new Client("Rachel", "java program", 1200), new Client("Anthony", "Configuration", 1000),
				new Client("Rachel", "PHP Script", 900), new Client("Rachel", "PHP Script", 1100));

		Map<String, List<Client>> groups = clients.collect(Collectors.groupingBy(Client::getName));
		System.out.println(groups);
	}

}

class Client {

	double budget;
	String name, project;

	Client(String n, String pr, double p) {
		budget = p;
		name = n;
		project = pr;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name + "," + budget;
	}
}
