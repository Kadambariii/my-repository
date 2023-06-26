package com.java.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {

	public static void main(String[] args) {
	
		Consumer<String> consumer=(s) ->System.out.println(s.toUpperCase());
		
		consumer.accept("Java 8");
		
		BiConsumer<String, String> biConsumer=(s1,s2) -> {System.out.println( s1.concat(s2));
				};
				
		biConsumer.accept("Java", " Programming");		

	}

}