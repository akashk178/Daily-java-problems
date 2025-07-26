
import java.util.Scanner;

class aadhar{
    String name;
    String fname;
    String mname;
    static String nationality;

    static{
        nationality = "indian";
    }
    void getdetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = sc.next();
        System.out.println("Enter the Father name: ");
        fname = sc.next();
        System.out.println("Enter the mother name: ");
        mname = sc.next();

    }
    void displayDetails(){
        System.out.println(name);
        System.out.println(fname);
        System.out.println(mname);
        System.out.println(nationality);   
    }
}

public class LaunchAadhar {
    public static void main(String[] args){
        aadhar a1 = new aadhar();
        aadhar a2 = new aadhar();
        aadhar a3 = new aadhar();

        a1.getdetails();
        a2.getdetails();
        a3.getdetails();

        a1.displayDetails();
        a2.displayDetails();
        a3.displayDetails();
    }    
}
