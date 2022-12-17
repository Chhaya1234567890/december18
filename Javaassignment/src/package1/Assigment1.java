package package1;

public class Assigment1 
//(((((10+2)+2)-2)*2)/2)
{
public int sum(int a,int b)

{
	int sum=a+b;
	return sum;
	
}

public int sub(int c, int d)
{
	int sub= c-d;
    return sub;	
}

public int mul(int e, int f)

{
	int mul= e*f;
    return mul;	
}

public void div(float g, float h)

{
	float div= g/h;
    System.out.println("final result:"+div );	
}
public static void main(String[]args)
{
	Assigment1 arth=new Assigment1();
	System.out.println("expression is(((((10+2)+2)-2)*2)/2) ");
	
	int add1=arth.sum(10,2);
	int add2=arth.sum(add1,2);
	int sub=arth.sub(add2,2);
	int mul=arth.mul(sub,2);
	arth.div(mul, 2);
}
}
