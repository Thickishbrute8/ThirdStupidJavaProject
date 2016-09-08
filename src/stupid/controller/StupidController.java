package stupid.controller;

public class StupidController 
{
	private static String myName;
	
	public StupidController()
	{
		myName = "Phoenix";
	}
	
	public static void main (String [] args)
	{
		System.out.println("this programis less stupid");
		System.out.println(myName);
	}
}