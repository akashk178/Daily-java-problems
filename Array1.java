
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
      

        for(int i =0; i<=n-1;i++){
              System.out.println("Enter the marks of the student no : " + (i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("The scores are : ");
        for(int i = 0; i<=n-1; i++){
            System.out.println("The marks of the students " + (i+1) + " is " + arr[i]);
        }
    }
}
