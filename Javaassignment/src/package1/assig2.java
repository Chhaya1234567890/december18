package package1;

public class assig2 {

	public void one()
	{
		this.four(1,2,3);
		System.out.println("Default constructor");
	}
	
	public void two(int a )
	{
		this.five(1,2,3,4);
		System.out.println("One Parameterize");
	}
	public void three(int a, int b)
	{
		this.two(1);
		System.out.println("Two parameterize");
		
	}
	public void four(int a, int b, int c)
	{
		
		System.out.println("three parameterize");
		
	}
	
	public void five(int a, int b,int c, int d)
	{
		this.one();
		System.out.println("four parameterize");
		
	}
	
	
public static void main(String[]args)
{
	assig2 obj=new assig2();	
	obj.three(1,2);

}
}