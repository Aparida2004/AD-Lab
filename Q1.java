import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter how many numbers you want to sum :");
	int n=sc.nextInt();
	System.out.print("Enter the numbers: ");
	n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++)
		sum=sum+i;
	System.out.println("The sum is: "+sum);

	}

}
