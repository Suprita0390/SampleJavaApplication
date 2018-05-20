package SampleProject;

public class SwitchCaseExample {

	public static void main(String args[])
	{
		int i=45;
		 //switch case is used instead of using multiple if else statements
		// we use case to add our criteria
		//switch supports string in Java
		switch(i)
		{
		case 10:
		{
			System.out.println(i);
			break;
		}
		case 20:
		{
			System.out.println(i);
			break;
		}
		case 50:
		{
			System.out.println(i);
			break;
		}
		default:
			System.out.println("The number is out of scope");
			break;
		}
		
		
	}
}
