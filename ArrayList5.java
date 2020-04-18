class Student
{
	int rollno;
	String name;
	int age;
	Student(int rollno, String name ,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
import java.util.*;
class ArrayList5
{
	public static void main(String args[])
	{
		Student s1=new Student(123,"rohan",34);
		Student s2 = new Student(123,"rohan",54);
		ArrayList<Student> ll=new ArrayList<Student>();
		ll.add(s1);
		ll.add(s2);
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			Student st =(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}
}