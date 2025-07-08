
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of classes: ");
        int m = sc.nextInt();
        System.out.println("Enter the students in each class: ");
        int n = sc.nextInt();

        //Array creation
        int a[][] = new int[m][n];

        //Creation 
        System.out.println("Enter the marks of each student: ");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
        //Displaying
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.println("The marks of class " +i+ "student" +j+ "is: " +a[i][j]);
            }
        }
    }
}
