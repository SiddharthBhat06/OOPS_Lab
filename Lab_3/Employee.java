package Lab_3;
import java.util.Scanner;
public class Employee {

	String ename;
	double eid,basic,da,gross_sal,net_sal;
	void read() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter employee name :");
		ename=s1.next();
		System.out.println("Enter employee id :");
		eid=s1.nextDouble();
		System.out.println("Enter employee basic salary :");
		basic=s1.nextDouble();
		s1.close();
	}
	
	void display() {
		da=0.52*basic;
		gross_sal=basic+da;
		double IT=0.3*gross_sal;
		double net_sal=gross_sal-IT;
		System.out.println("Employee name is : "+ename+"\nEmployee Id : "+eid+"\nBasic salary : "+basic+"\nDaily allowance : "+da+"\n Gross salary : "+gross_sal+"\nNet salary is : "+net_sal);
	}
	void compute_net_sal() {
		da=0.52*basic;
		gross_sal=basic+da;
		double IT=0.3*gross_sal;
		net_sal=gross_sal-IT;
		System.out.println("Net salary is :"+net_sal);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.read();
		e.display();
		e.compute_net_sal();
	}

}
