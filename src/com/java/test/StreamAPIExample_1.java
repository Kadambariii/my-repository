package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample_1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(12,56,22,86,46,99,39));
		
		//chain structure
		List modifiedList=list.stream()
				.map(x -> x*x)
				.collect(Collectors.toList());
		
		
		//stream : a sequential Stream over the elements in this collection
		//map : Returns a stream consisting of the results of applying the given function to the elements of this stream. 
		//collect: The collect method is used to return the result of the intermediate 
		//operations that are performed  on the stream. 
		System.out.println(list);
		System.out.println(modifiedList);
		
		
		
		List oddNumbersList=list.stream()
				.filter(x -> (x%2!=0))
				.collect(Collectors.toList());
		
		System.out.println(oddNumbersList);
		
		List evenNumbersList=list.stream()
				.filter(x -> (x%2==0))
				.collect(Collectors.toList());
		
		System.out.println(evenNumbersList);
		List sortedList=list.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(sortedList);
        int total=list.stream().filter(x -> x%2==0).reduce(0,(ans,i)->ans+i);		
		System.out.println(total);
	}

}