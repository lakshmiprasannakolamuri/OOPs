package com.javapratice;

public class Child extends Parent
{
	int age = 0;

	public Child(String name, int age)
	{
		super(name);
		this.age = age;
	}

	public void show_age()
	{
		System.out.println("Age of the child is:" + age);
	}
}
