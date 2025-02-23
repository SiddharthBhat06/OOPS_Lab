package Lab_3;
import java.util.Scanner;
public class Mixer {
	int arr[];
	void accept() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. of elements in ascending order :");
		int n= input.nextInt();
		arr=new int[n];
		System.out.println("Enter elements :");
		for(int i=0;i<n;i++) {
			System.out.print("Enter :");
			arr[i]=input.nextInt();
			if(i>0 &&arr[i-1]>=arr[i]){
				System.out.println("no duplicate allowed!");
				System.exit(0);
			}
		}
		input.close();
	}
	Mixer Mix(Mixer A) {
		int n1=this.arr.length;
		int n2=A.arr.length;
		int n=n1+n2;
		int[] mergedarr=new int[n];
		for(int i=0;i<A.arr.length;i++) {
			mergedarr[i]=this.arr[i];
			}
		for(int i=0;i<A.arr.length;i++) {
			mergedarr[i+this.arr.length]=A.arr[i];
			}
		Mixer B=new Mixer();
		B.arr = mergedarr;
		return B;	
	}
	void display() {
		System.out.println("The mixed array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Mixer obj1=new Mixer();
		Mixer obj2=new Mixer();
		obj1.accept();
		obj2.accept();
		obj1=obj1.Mix(obj2);
		obj1.display();
	}

}
