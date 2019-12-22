package whiz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P3Q39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
        Map<Integer, List<Integer>> map = list.parallelStream().collect(Collectors.groupingByConcurrent(i -> i % 2 == 0 ? 0 : 1));
         System.out.println(map.get(0));         
	}

}
