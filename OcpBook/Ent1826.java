import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Ent1826 {
	public void warp(javaBrainsLambda.Point3d a,enth.Point b) {
		a.x=3;
		a.y=3;
		a.z=4;
		
		b.x=4;
		b.y=4;
		b.z=4;
		
	}
	public static Optional<String> getGrade(int marks) {
		Optional<String> grade = Optional.empty();
		if (marks > 50) {
		 	grade = Optional.of("PASS");
		} else {
			grade.of("FAIL");
		}
		return grade;
	}

	public static void main(String[] args) {
		List<String> names=new CopyOnWriteArrayList<>();
		names.add("fd");
		names.add("fda");
		Iterator<String> it= names.iterator();
		while(it.hasNext()) {
			if(true) {
				it.remove();
			}
		}
		
		
		Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		for(String key: foodData.keySet())
		{System.out.println(foodData.get(key));
			foodData.remove(key);
		}
		Optional<String> grade = Optional.empty();

		Optional<String> grade1 = getGrade(50);
		Optional<String> grade2 = getGrade(55);
		// System.out.println(grade1);
		System.out.println(grade1.orElse("UNKNOWN"));
		if (grade2.isPresent()) {
			grade2.ifPresent(x -> System.out.println(x));
		} else {
			System.out.println(grade2.orElse("Empty"));
		}
		
		
		
		
	}
	
	
}
