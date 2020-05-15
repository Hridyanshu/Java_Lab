//Implementation of class, object.
class StudentDetails
{
	String name;
	int rollno;
	int sapid;
	StudentDetails()
	{
		name = "Hridyanshu";
		rollno = 47;
		sapid = 500068500;
	}
}
public class Display
{
	public static void main(String args[])
	{
		StudentDetails student1 = new StudentDetails();
		System.out.println(student1.name);
		System.out.println(student1.rollno);
		System.out.println(student1.sapid);
	}
}
