package package1;

public class Arithmetic
{
	//Class creation--1
	public int add(int a,int b)
	//int=non void method add=main method (int a, int b)=object creation in main method,
	{
		int sum=a+b;
		System.out.println("Result of the sum is="+sum);
		return sum;
	}
	public int sub(int c, int d)
	{
		int sub=c-d;
		System.out.println("Result of the sub is="+sub);
		return sub;
		
	} 
	public void mul(int sum, int sub)
	{
		int mul=sum*sub;
		System.out.println("final result is="+mul);
	}
	// public= access specifier static= keyword, void=return type, main= method name,
	//(String[] args)= array of string type, Main method creation-----2
	
	
	public static void main(String[] args) {
		//class name reference_ name=new class name();object creation inside main method----3
		Arithmetic ob=new Arithmetic();
		//Calling value and method using reference variable.-----4
		int sumresult=ob.add(10,2);
		int subresult=ob.sub(sumresult,2);
		System.out.println("the final result of (a+b)(c-d)" );
		ob.mul(sumresult, subresult);
			
	}

}
