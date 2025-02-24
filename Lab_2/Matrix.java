package Lab_2;
import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size");
		int n=sc.nextInt();
		int[][] matrix=new int[n][n];
		System.out.print("Enter matrix elements :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		System.out.print("Non diagonal elements :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j&&i+j!=n-1) {
					System.out.println(matrix[i][j]+" ");
					sum+=matrix[i][j];
				}
			}
		}
		System.out.println("Sum is ="+sum);
		sc.close();
	}

}
