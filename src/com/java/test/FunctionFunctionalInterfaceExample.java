package com.java.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionFunctionalInterfaceExample {

	public static void main(String[] args) {

		Function<String, Integer> function=(s) -> {return s.length();};
		
		System.out.println(function.apply("Java Programming"));
		
		
		
		BiFunction<String, String, Integer> bifunction=(s1,s2) ->{ return s1.length()+s2.length();};
		
		System.out.println(bifunction.apply("Java", "Programming"));
	}

}