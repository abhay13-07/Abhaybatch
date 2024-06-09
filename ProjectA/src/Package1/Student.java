package Package1;

public class Student
{
	int age;
	int roll_number;
	public void Display1()
	{
		System.out.println("Welcome all");
	}
	public void Display2()
	{
		System.out.println("Automation is too easy");
	}

public static void main(String[] args)
{
	Student enroll=new Student();
	enroll.age=28;
	enroll.roll_number=13;
	enroll.Display1();
	enroll.Display2();
	System.out.println("Age is:"+enroll.age);
	System.out.println("Roll Number is:"+enroll.roll_number);
	}
}