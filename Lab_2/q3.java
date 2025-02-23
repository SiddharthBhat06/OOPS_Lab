package Lab_2;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your year of birth :");
		int y=sc.nextInt();
		System.out.println("Enter the year you started working :");
		int w =sc.nextInt();
		int service = y+60-w;
		System.out.println("Your years of service are : "+service);
		sc.close();
	}

}
