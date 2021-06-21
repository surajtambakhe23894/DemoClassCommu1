package com.m1;

import com.m2.Test2;

public class Test1 {
public void m1()
{
System.out.println("Test1---m1");	
}
public void m55()
{
System.out.println("Test1---m55");	
}
public static void main(String[] args) {
	System.out.println("Test1---main");
	Test1 t1=new Test1();
	t1.m1();
	
	Test2 t2=new Test2();
	t2.m2();
	
}
}
