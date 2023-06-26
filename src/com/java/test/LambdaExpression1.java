package com.java.test;

import java.util.ArrayList; import java.util.List;

interface Demo

{ public void add(int a,int b);

}

public class LambdaExpression1 {

public static void main(String[] args) {

List<Integer> list=new ArrayList<>();

list.add(11); list.add(22);

list.add(33); list.add(44);

list.add(55);

list.add(66);

list.forEach((x)->{

System.out.println(x);

}

);

System.out.println("=============== =");

list.forEach((x)->{

if(x%2==0)

System.out.println(x);

} );
list.forEach((x)->{

System.out.println(x);

});

System.out.println("=============== =");

list.forEach((x)->{

if(x%2==0)

System.out.println(x);

});

System.out.println("=============== =");

list.forEach((x)->{

if(x%2!=0)

System.out.println(x); }

);

Demo d=(a, b) ->{

System.out.println(a+b);}; d.add(10, 20);

}

}