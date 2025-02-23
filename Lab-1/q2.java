package Lab_1;
import java.util.Scanner;
public class q2 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number :");
		int a=scan.nextInt();
		System.out.println("Enter second number :");
		int b=scan.nextInt();
		while(b!=0) {
			int car=a&b;
			a=a^b;
			b=car<<1;
		}
		System.out.println("Sum is :"+a);
		System.out.println("The sum is :"+((a&1)==0?"Even":"Odd"));
		scan.close();
	}

}
