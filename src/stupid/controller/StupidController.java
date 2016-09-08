package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	private static String myName;
	private Scanner inputReader;

	public StupidController()
	{
		myName ="Phoenix,";
		inputReader = new Scanner(System.in);
	}

	public void start()
	{
		System.out.println("This programis less stupid");
		System.out.println(myName);
		askQuestions();
	}


	private void askQuestions()
	{
		System.out.println("how is your day?");
		String input = inputReader.nextLine();
		System.out.println("Oh, you said: " + input + " about your day ");
	}
}	