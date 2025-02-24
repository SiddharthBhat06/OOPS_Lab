package Lab_2;
import java.util.Scanner;
public class Bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int units = 0;
		System.out.print("Enter daily consumption :");
		for(int i =0;i<7;i++) {
			units+=sc.nextInt();
		}
		double bill=0;
		switch(units/100){
			case 0:
				bill=units*700;
				break;
			case 1:
				bill=(100*7.00)+(units-60)*8.00;
				break;
			default:
				bill=(100*7.00)+(100*8.00)+(units-200)*10.00;
				break;
		}
		System.out.println("Electricity bill  is :"+bill);
		sc.close();
	}

}
