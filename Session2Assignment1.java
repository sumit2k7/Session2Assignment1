import java.util.Scanner;

public class Session2Assignment1 {

	public static void main (String args[])
	{
		int iage;
		System.out.println("Please Enter your Age");
		Scanner sc = new Scanner(System.in);
		
		iage=sc.nextInt();
		sc.close();
		if(iage>=18)
		{
			System.out.println("You are Eligible to Vote");
		}
		else
		{
			System.out.println("You are Not Eligible to Vote");
		}
	}
}
