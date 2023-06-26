package com.java.test; //Functional interface

//An interface with single abstract method(SAM - Aingle Abstract

//Method)

@FunctionalInterface //annotation to denote functional interface interface TestInterface

{ //An abstract function

void demo(int x);

}

public class LambdaExpression {

public static void main(String[] args) {

//lambda expression to implement the body of the abstract method 
	//TestInterface obj=(x)->System.out.println(x*x);

//calls the lambda expression 
	//obj.demo(5);

}

}