package com.lambda;


@FunctionalInterface
interface A 
{
	void show();
//	String toString();

}
//class B implements A 
//{
//	public void show()
//	{
//		System.out.println("hi");
//	}
//}
public class Demo {

	public static void main(String[] args)
	{
		//lambda
		A obj = () -> System.out.println("hii in show");
		obj.show();

	}

}
