package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	public void buildMainMenu() {
		System.out.println("1.Sum");
		System.out.println("2.Minus");
		System.out.println("3.Div");
		System.out.println("4.Mult");
	}

	public void chooseOperation() {
		System.out.println("Choose the operation");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String operation;
		try {
			operation = bufferedReader.readLine();
			if (operation.equals("1")) {
				sum();
			} else if (operation.equals("2")) {
				min();
			} else if (operation.equals("3")) {
				div();
			} else if (operation.equals("4")) {
				mult();
			} else {
				System.out.println("You set the wrong argument, please choose the 1/2/3/4");			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sum() {

		int firstArgument = 0;
		int secondArgument = 0;

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the first argument");
		String firstArgumentInput;
		try {
			firstArgumentInput = bufferedReader.readLine();
			firstArgument = Integer.parseInt(firstArgumentInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Enter the second argument");
		String secondArgumentInput;
		try {
			secondArgumentInput = bufferedReader.readLine();
			secondArgument = Integer.parseInt(secondArgumentInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		System.out.println(firstArgument + secondArgument);

	}

	public void min() {

		int firstArgument = 0;
		int secondArgument = 0;

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the first argument");
		String firstArgumentInput;
		try {
			firstArgumentInput = bufferedReader.readLine();
			firstArgument = Integer.parseInt(firstArgumentInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Enter the second argument");
		String secondArgumentInput;
		try {
			secondArgumentInput = bufferedReader.readLine();
			secondArgument = Integer.parseInt(secondArgumentInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(firstArgument - secondArgument);

	}

	public void div() {

		int firstArgument = 0;
		int secondArgument = 0;

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the first argument");
		String firstArgumentInput;
		try {
			firstArgumentInput = bufferedReader.readLine();
			firstArgument = Integer.parseInt(firstArgumentInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Enter the second argument");
		String secondArgumentInput;
		try {
			secondArgumentInput = bufferedReader.readLine();
			secondArgument = Integer.parseInt(secondArgumentInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(firstArgument / secondArgument);

	}

	public void mult() {

		int firstArgument = 0;
		int secondArgument = 0;

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the first argument");
		String firstArgumentInput;
		try {
			firstArgumentInput = bufferedReader.readLine();
			firstArgument = Integer.parseInt(firstArgumentInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Enter the second argument");
		String secondArgumentInput;
		try {
			secondArgumentInput = bufferedReader.readLine();
			secondArgument = Integer.parseInt(secondArgumentInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(firstArgument * secondArgument);

	}

}
