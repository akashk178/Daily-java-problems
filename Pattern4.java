
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int k=n; k>=i; k--){
                System.out.print("-");
            }
            for(int j =1; j<=2*i-1; j++){
                if(i==1 || i==5 || j==1 || j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
}
