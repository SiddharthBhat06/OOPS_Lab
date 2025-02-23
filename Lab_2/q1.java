package Lab_2;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the fare :");
		double totalfare=sc1.nextDouble();
		double distance;
		if(totalfare<=50) {
			distance=totalfare/10;
		}
		else if(totalfare<=170) {
			distance=5+(totalfare-50)/8;
		}

		else {
			distance=20+(totalfare-170)/5;
		}
	
	System.out.println("Distance is :"+distance);
	sc1.close();
	}

}
