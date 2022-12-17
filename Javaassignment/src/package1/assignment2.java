package package1;

public class assignment2{
//(((((10*2)+2)-2)-2)/2)

	public int mul(int a,int b)
	
	{
		int mul=a*b;
		return mul;
	}
	
	public int add(int c, int d)
	
	{
		int add=c+d;
		return add;
		
	}
	public int sub(int e, int f)
	{
		int sub=e-f;
		return sub;
	}
	
	public void div(float g, float h)
	{
		float div=g/h;
		
		System.out.println("final result of (((((10*2)+2)-2)-2)/2)" +div);
	}
	public static void main(String[]args)
	{
		assignment2 arth=new assignment2();
		System.out.println("Exp...is (((((10*2)+2)-2)-2)/2)");
		int mul=arth.mul(10,2);
		int add=arth.add(mul, 2);
		int sub=arth.sub(add,2);
		int sub2=arth.sub(sub,2);
		arth.div(sub2,2);
		
	}

}
