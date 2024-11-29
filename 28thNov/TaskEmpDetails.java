//28/11/24
//1.Write a java program to print employee details using parameterized constructor

package AllProgram;

public class TaskEmpDetails {
	int no,empno,salary;
	String name,designation;
TaskEmpDetails(int n,int en,int sal, String na,String des)
{
	no=n;
	empno=en;
	salary=sal;
	name=na;
	designation=des;
}
void display()
{
	
	System.out.println(no+" "+name+" 	"+empno+" 	"+"	 "+designation+"	  "+salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("			EMPLOYEE DETAILS\n");
		
		TaskEmpDetails p1=new TaskEmpDetails(1,1001,200000,"Madhavan","Team Lead");
		p1.display();
		TaskEmpDetails p2=new TaskEmpDetails(2,1002,800000,"Saran","Developer");
		p2.display();
		TaskEmpDetails p3=new TaskEmpDetails(3,1003,700000,"Vikram","Vice President");
		p3.display();
		TaskEmpDetails p4=new TaskEmpDetails(4,1004,100000,"Lingaa","Developer");
		p4.display();
		
	}

}
