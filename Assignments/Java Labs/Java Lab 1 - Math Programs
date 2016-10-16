# Java Lab 1: Math Programs

## Introduction

Please read this document in Chrome! :)

This project will contain several small programs that
use math formulas, input, and output.

### Topics

* Eclipse / BlueJ
* Text output
* Text input
* Math operators

## Turn-In

Turn in all .java file(s) to the dropbox.

## Group Policy

You can collaborate with another student on this lab. Make sure to put your teammate's name in the Dropbox comments when done.

---

# Review: Creating an Eclipse project

## Create the project

1. In Eclipse, it will ask you for a location for your workspace. The default is fine.
1. Go to **File > New > Project...**
1. Select Java Project.
1. Give your project a name, and otherwise use default values. Click **Finish**.

## Create the class file

1. To the left side of the window, there should be a **Package Explorer**. You might have to click an icon on the left side to get it to appear.
1. Right-click on the project folder and select **New > Class...**
1. Set the **Name** of your class. This lab has several programs, so make this class based on which program.
1. Leave the rest of the fields as defaults. Click **Finish**.

## Create the entry method

Within this new class, you will create a **main** function, which will be the entry point of your program:

	public class MyProgram {
		public static void main(String[] args)
		{
			// Code goes here
		}
	}
	
This source file ends with **.java** after the class name, and this is the file
you can use to upload your work.

---

# Program 1: Area and Perimeter of a rectangle

**Class file: AreaPerimeterProgram**

Start out with the following base program:

	import java.util.Scanner;

	public class AreaPerimeterProgram {
		public static void main(String args[])
		{
			Scanner scanner = new Scanner( System.in );
			
			// your code goes here
			
			scanner.close();
		}
	}

The **Scanner** object is so that we can get the user's input. The variable
name for this Scanner is "scanner" (lower-case), so we will utilize this
lower-case **scanner** name when we need to get user input.

**Output:** Using **System.out.println**, display the program's name: "Area and Perimeter Calculator"

	System.out.println( "Area and Perimeter Calculator" );

**Variable declarations:** Create three variables within your main function: width, length, area, and perimeter.
All of these should be **doubles**.

	double width, length, area, perimeter;

**Output:** Ask the user to enter the width.

**Input:** Get double input and store it in *width*.

	System.out.print( "What is the width? " );
	width = scanner.nextDouble();

**Output:** Ask the user to enter the height.

**Input:** Get double input and store it in *height*.

**Calculate:** Calculate the area of the rectangle:

	area = width * length;

**Calculate:** Calculate the perimeter of the rectangle (sum of all edges of the rectangle).

**Output:** Display the area and the perimeter of the rectangle. Make sure to label each item.

	System.out.println( "Area: " + area );
	System.out.println( "Perimeter: " + perimeter );

## Sample output

![Screenshot of program 1](images/lab1_program1.png)

<details>
	<summary><h2>
		VIEW SOLUTION
	</h2></summary>

	import java.util.Scanner;

	public class AreaPerimeterProgram {
		public static void main(String args[])
		{
			Scanner scanner = new Scanner( System.in );
			
			double width, length, area, perimeter;
			
			System.out.println( "Area and Perimeter Calculator" );
			
			System.out.print( "What is the width? " );
			width = scanner.nextDouble();
			
			System.out.print( "What is the length? " );
			length = scanner.nextDouble();
		
			area = width * length;
			perimeter = 2 * width + 2 * length;

			System.out.println( "Area: " + area );
			System.out.println( "Perimeter: " + perimeter );
			
			scanner.close();
		}
	}

</details>



