import java.util.Scanner;

public class Numbers {
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number:");
        double n=sc.nextDouble();
        if(n % 2 ==0) {
            System.out.println(n + " is a even number");
        }else {
            System.out.println(n + " is a odd number");
        }
    }
}
