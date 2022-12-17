package package1;

public class day4assig1 {

	public day4assig1()
	{
		this(1,2,3,4);
		System.out.println("Default constructor");
	}
	
	public day4assig1(int a )
	{
		this();
		System.out.println("One Parameterize");
	}
	public day4assig1(int a, int b)
	{
		this(1,2,3);
		System.out.println("Two parameterize");
		
	}
	public day4assig1(int a, int b, int c)
	{
		this(1);
		System.out.println("three parameterize");
		
	}
	
	public day4assig1(int a, int b,int c, int d)
	{
		
		System.out.println("four parameterize");
		
	}
	
	
public static void main(String[]args)
{
	day4assig1 ob=new day4assig1(1,2);	

}
}