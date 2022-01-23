package com.javapratice;

class Person
{

	String name;
	Integer age;

	void speak()
	{
		System.out.println("Iam prasanna ");
	}

	int caluculateYearsToMyRetirement()
	{
		int yearsleft = 65 - age;
		return yearsleft;
	}

	int getAge()
	{
		return age;

	}

	String getName()
	{
		return name;
	}
}

public class App
{

	public static void main(String[] args)
	{
		Person person1 = new Person();
		person1.name = "prasanna";
		person1.age = 26;
		person1.speak();

		int age = person1.getAge();
		String name = person1.getName();
		System.out.println("Name is:" + name);
		System.out.println("Age is :" + age);

		
		// int age = person1.caluculateYearsToMyRetirement();
		// System.out.println(person1.caluculateYearsToMyRetirement());

	}

}
