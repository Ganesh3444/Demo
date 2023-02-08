package distinctFilterSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<String> membernames = new ArrayList<String>();
		membernames.add("ganesh");
		membernames.add("vidhi");
		membernames.add("samidha");
		membernames.add("kalyani");
		membernames.add("dhiraj");
		membernames.add("riya");
		membernames.add("Shweta");
		membernames.add("Chetan");
		
		System.out.println(membernames);
		
		System.out.println("----------------------------------------");
		membernames.stream().distinct().filter(n -> n.startsWith("s")).forEach(n -> System.out.println(n));
		
		membernames.stream().filter(n -> n.startsWith("s")).map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));
		
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i<11; i++) {
			list.add(i);
		}
		//Maping
		list.stream().filter(x-> x%2==0).map(x -> x*x).forEach(x -> System.out.println(x));
		
		//sorting
		list.stream().sorted().forEach(x -> System.out.println(x));
		
		membernames.stream().sorted().forEach(n -> System.out.println(n));
		System.out.println("--------------------------------------------");
		
		//reverse order 
		membernames.stream().sorted(Collections.reverseOrder()).forEach(n -> System.out.println(n));
		list.stream().sorted(Collections.reverseOrder()).forEach(x -> System.out.println(x) );
		
		//match methods 
		
		boolean matchcheck = membernames.stream().allMatch(x -> x.startsWith("g"));
		System.out.println(matchcheck);
		
		boolean matchcheck1 = membernames.stream().anyMatch(x -> x.startsWith("B"));
		System.out.println(matchcheck1);
		
		boolean matchcheck2 = membernames.stream().noneMatch(x -> x.startsWith("a"));
		System.out.println(matchcheck2);
		
		// boolean matchcheck3 = membernames.stream().findFirst().filter(x -> System.out.println(x));
		
		//***** boolean match = membernames.stream().allMatch(x -> x.startsWith("ganesh"));
		
		// count method
		long match1 = membernames.stream().filter(n -> n.startsWith("g")).count();
		System.out.println(match1);
		
		Integer integer = list.stream().filter(x -> x!=null).max(Integer::compareTo).get();
		System.out.println(integer);
		
		Integer integer2 = list.stream().filter(x -> x!=null).min(Integer::compareTo).get();
		System.out.println(integer2);
		
		
	}
}
