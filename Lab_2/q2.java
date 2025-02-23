package Lab_2;
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 9 digit reg. no :");
		String regno = sc.next();
		if(regno.length()!=9||!regno.matches("\\d{9}")) {
			System.out.println("Invalid");
		}
		else {
			int year=Integer.parseInt(regno.substring(0,2));
			if(year>25) {
				System.out.println("The student is from : 19"+year);
			}
			else {
				System.out.println("The student is from : 20"+year);
			}
		}
	sc.close();
	}

}
