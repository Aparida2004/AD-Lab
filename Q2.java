import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter how many numbers: ");
    int n=sc.nextInt();
    int[] arr= new int[n];
    System.out.print("Enter "+n+" numbers");
    for(int i=0;i<arr.length;i++)
         arr[i]=sc.nextInt();
    int min=arr[0];
    int max=arr[0];
    for(int i=1;i<n;i++){
    if(arr[i]>max)
    max=arr[i];
    if(arr[i]<min)
    min=arr[i];
    }
    System.out.println("The minimum number is "+min);
    System.out.println("The maximum number is "+max);







    }

}
