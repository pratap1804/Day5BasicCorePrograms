import java.util.Scanner;

public class Toss {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Times You Want To Flip?");
        int numOfFlips = sc.nextInt();

        int heads =0;
        int tails =0;

        if(numOfFlips <= 0){
            System.out.println("Enter A Valid Number!");
        }

        for(int i = 0; i<numOfFlips; i++){

            double random = Math.random();

            if(random > 0.5){
                System.out.println("Heads Won");
                heads++;
            }
            else{
                System.out.println("Tails Won");
                tails++;
            }
        }
        double percentage1 = (heads*100)/numOfFlips;
        double percentage2 = (tails*100)/numOfFlips;
        System.out.println("Heads Winning Percentage: "+percentage1);
        System.out.println("Tails Winning Percentage: "+percentage2);
    }
}
