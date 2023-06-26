package com.java.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {

	public static void main(String[] args) {
		
		
		Predicate<Integer> predicate=(t) ->{
			if(t%2==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		
		
		System.out.println(predicate.test(8));
		
		//Anonymous class implements Bipredicate interface
		BiPredicate<String, String> biPredicate=new BiPredicate<String, String>() {
			
			@Override
			public boolean test(String t, String u) {
				return t.equals(u);
			}
		};
		
		//Lambda expression implements Bipredicate interface
		
		BiPredicate<String, String> biPredicate1=(s1,s2) ->s1.equals(s2);
		
		System.out.println(biPredicate.test("Java", "JAVA"));
		System.out.println(biPredicate1.test("Java", "JAVA"));

	}

}