package stupid.controller;

import java.util.Scanner;

public class StupidController
{
	private String myName;
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
		System.out.println("My next question is this: What is the best type of food?");
		String foodinput = inputReader.nextLine();
		System.out.println("Ok, you typed this: " + foodinput);
	
		System.out.println("What is the greatest game of all time?");
		String gamergirlinput = inputReader.nextLine();
		System.out.println("While you may think: " + gamergirlinput + " is the best game but actually it is not " );
		
		System.out.println("woahheyguyswelcometoebgames");
		int someInput = inputReader.nextInt();
		System.out.println("Ok, you typed this: " + someInput);
	}	
	
}	
