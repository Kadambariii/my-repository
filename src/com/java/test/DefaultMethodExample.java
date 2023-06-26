package com.java.test;


interface Activity
{
	public void walk();
	public void run();
	
	default void eat()
	{
		System.out.println("This is eat method");
	}
	
	static void sleep()
	{
		System.out.println("This is eat method");
	}
	
	
}

class Walk implements Activity
{

	@Override
	public void walk() {
		System.out.println("This is walk method");
		
	}

	@Override
	public void run() {
		System.out.println("This is run method");
		
	}
	
}

class Walk1 implements Activity
{

	@Override
	public void walk() {
		System.out.println("This is walk method");
		
	}

	@Override
	public void run() {
		System.out.println("This is run method");
		
	}
	
}
public class DefaultMethodExample {

	public static void main(String[] args) {
		Walk w=new Walk();
		w.eat();
		w.run();
		w.walk();
		Activity.sleep();
		

	}

}//default method and static method added in java8