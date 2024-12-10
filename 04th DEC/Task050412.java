//04/12/24
//Task05
//5. Write a Java program to create a class called "Person" with a name and age attribute.
//Create two instances of the "Person" class, set their attributes using the constructor,
//and print their name and age.

package AllProgram;
class Person1
{
	public String name;
	public int age;
	public  Person1(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
}

public class Task050412 {
	public static void main(String[] args) {
		Person1 obj=new Person1("Saran",23);
		Person1 obj1=new Person1("Madhavan",23);
		System.out.println("Person 1:");
		System.out.println("Name:"+obj.getName());
		System.out.println("Age:"+obj.getAge());
		System.out.println("Person 2:");
		System.out.println("Name:"+obj1.getName());
		System.out.println("Age:"+obj1.getAge());
	}
}
