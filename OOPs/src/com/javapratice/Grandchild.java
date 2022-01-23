package com.javapratice;

public class Grandchild extends Child
{
	String gender = "";

	public Grandchild(String name, int age, String gender)
	{
		super(name, age);
		this.gender = gender;

	}

	public void show_gender()
	{
		System.out.println("Gender is :" + gender);
	}
}
