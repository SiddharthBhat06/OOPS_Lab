package Lab_3;
import java.util.Scanner;
public class Student {
	String sname;
	int[] marks_array= {0,0,0};
	double total;
	double avg;
	void assign() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter name :");
		sname=sc1.next();
		for(int i=0;i<3;i++) {
			System.out.println("Enter the marks of subject "+(i+1)+" :");
			marks_array[i]=sc1.nextInt();
			}	
		sc1.close();
		}
	void display() {
		System.out.println("Name is :"+sname+"\nMarks are :"+marks_array[0]+","+marks_array[1]+","+marks_array[2]+"\nAverage is :"+(marks_array[0]+marks_array[1]+marks_array[2])/3);
	}
	void compute() {
		System.out.println("Total is :"+(marks_array[0]+marks_array[1]+marks_array[2])+"\nAverage is :"+(marks_array[0]+marks_array[1]+marks_array[2])/3);
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.assign();
		s.display();
		s.compute();

	}

}
