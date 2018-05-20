package SampleProject;

public class PrePostIncrement {
	public static void main(String args[])
	{
		//i++ -> post increment(increment happens after assignment
		//++i -> pre increment (increment happens first and then assignment)
		
		
		//Post Increment 
		int i=5;
		int j;
		j=i++; // post increment
		System.out.println(j);//here value of j will be 5
		
		//Pre Increment
		j=++i;
		System.out.println(j);
	}

}
