import java.util.Scanner;

public class Power {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Power up to Which power you want: ");
        int num = sc.nextInt();
        int powerOfTwo =1;

        for(int i =1; i<=num; i++){
            powerOfTwo *= 2;
        }

        System.out.println(num+ " Power of 2 is: "+ powerOfTwo);
    }
}
