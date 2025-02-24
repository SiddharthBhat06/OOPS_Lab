package Lab_2;
import java.util.Scanner;
public class factorial {
	int fact(int a) {
		if(a==0) {
			return 1;
		}
		return a*fact(a-1);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	int a=sc.nextInt();
	factorial obj=new factorial();
	int result=obj.fact(a);
	System.out.println("Factorial is "+result);
	sc.close();
	}

}
