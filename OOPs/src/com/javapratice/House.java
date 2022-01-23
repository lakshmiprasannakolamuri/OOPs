package com.javapratice;

public class House
{
	private String name;
	private int code;

	private int age;

	public House()
	{
		this("kamalika", 0);
		name = "prasanna";
		System.out.println("First Constructor Running!");
	}

	public House(String name)
	{
		// this.name = name;
		this("prasanna", 0);

		System.out.println("Second Constructor Running!");
	}

	public House(String name, int code)
	{
		this.name = name;
		this.code = code;

		System.out.println("Third Constructor Running!");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getCode()
	{
		return code;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

}
