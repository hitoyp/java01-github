package application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Programa1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Allan");
		list.add("Bruno");
		list.add("Wesley");
		list.add("Jeferson");
		list.add("Joao");
		list.add("Igor");
		list.add("Alex"); 
		list.add(2, "gustavo");
		
		
		
		System.out.println(list.size());
		
		for(String x : list ) {
			System.out.println(x);
		} 
		
		
		System.out.println("------------------------------"); 
		
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'W');
		
		for(String x : list ) {
			System.out.println(x);
		} 
		
		System.out.println("------------------------------");
		System.out.println("index of igor: " + list.indexOf("Allan"));   
		
		System.out.println("--------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); 
		
		
		for(String x : result ) {
			System.out.println(x);
		} 
		
		
		System.out.println("--------------------"); 
		
		
		String name = list.stream().filter((x -> x.charAt(0) == 'T')).findFirst().orElse(null); 
		
		System.out.println(name);

	}

}
