import java.util.Scanner;
public class Q3 {
public static void rotateArray(int[] arr, int k){
    int n=arr.length;
    k=k%n;
    int[] temp= new int[n];
    for(int i=0;i<n;i++){
    int newpos=(i+n-k)%n;
    temp[newpos]=arr[i];
    }
    System.arraycopy(temp, 0, arr, 0, n);
}
    public  static void displayArray(int[] arr){
        for(int num: arr){
            System.out.print(num+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number of elements in the array :");
    int n=sc.nextInt();
    int[] arr= new int[n];
    System.out.print("Enter the elements of the array :");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    } 
    System.out.print("Enter the number of times you want to rotate the array anticlockwise :");
    int k=sc.nextInt();
    rotateArray(arr, k);  
    System.out.print("Array elements after rotating "+k+" positions :");
    displayArray(arr);
    }

}

