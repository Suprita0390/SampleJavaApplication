package SampleProject;

public class TernaryOperatorDemo {
	
	public static void main(String args[])
	{
		int i=20;
		int j=5;
		
		/*if(i==10)
		{
			System.out.println(j=5);
		}
		else
		{
			System.out.println(j=8);
		}*/
		//ternary operator
		
		j = i==10?5:8;
		System.out.println(j);
		
	}

}
