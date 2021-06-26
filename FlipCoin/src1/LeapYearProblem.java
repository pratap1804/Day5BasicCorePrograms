import java.util.Scanner;

public class LeapYearProblem {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a four digit year: ");
        int year = sc.nextInt();

        if(year>999 && year < 10000){
            if(year % 4 == 0 && year % 100 !=0){
                System.out.println(year+" is a leap year");
            }
            else if(year % 400 == 0){
                System.out.println(year+" is a leap year");
            }
            else
                System.out.println(year+ " is not a leap year");
        }
        else
            System.out.println("Enter a four digit year");
    }
}
