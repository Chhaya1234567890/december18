package package1;

public class Class2 {

	public Class2()
	{
		
		System.out.println("Default constructor");
	}
	public Class2(int a )
	{
	
		System.out.println("One Parameterize");
	}
	public Class2(int a, int b)
	{
		this();
		System.out.println("Two parameterize");
		
	}
	
public static void main(String[]args)
{
Class2 obj=new Class2();	
Class2 obj1=new Class2(22,23);	
Class2 obj2=new Class2(33);	

}
}
