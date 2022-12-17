package package1;

public class student {
	int age;
	int rollnumber;
	public void display()
	
	{
		System.out.println("wellcome");
		
	}
	public void display1()
	{
		System.out.println("student details");
	}
	public static void main(String[]args)
	{
		student komal=new student();
		
		komal.display();
		komal.rollnumber=12;
		System.out.println("rollnumber is" +komal.rollnumber);
		
		komal.display1();
		komal.age=21;
		System.out.println("Class is" +komal.age);
		
		
	}
	
}
