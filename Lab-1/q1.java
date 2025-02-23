package Lab_1;
import java.util.Scanner;
public class q1 {
	//salary
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Salary calculation :");
		System.out.println("Enter hours :");
		double ho =scan.nextInt();
		System.out.println("Enter rate ::");
		double rate=scan.nextInt();
		double over = ho-40;
		System.out.println("Salary is calculated");
		double sal = rate * 40 + over*1.5*rate;
		System.out.println("Salary is : "+sal);
		scan.close();

	}

}
