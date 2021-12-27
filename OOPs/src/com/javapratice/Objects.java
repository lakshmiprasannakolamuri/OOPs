package com.javapratice;

//import java.util.Scanner;

public class Objects
{

	//Scanner scan = new Scanner(System.in);

	String myname ;
	int mymarks ;
	
	//creating Constructor
     Objects(String name, int marks){
		 myname = name;
		 mymarks = marks;
		 
	 }

	public void get_details()
	{
		
	
	/*	System.out.println("Enter the name:");
		name = scan.nextLine();

		System.out.println("Enter the marks:");
		marks = scan.nextInt();*/

	}

	public void show_details()
	{
		System.out.println("Name of the student" + myname);
		System.out.println("Marks of the student" + mymarks);
	}
}
