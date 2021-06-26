import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Order up to which you want the series: ");
        int num = sc.nextInt();

        double series = 0;

        for(int i = 1; i<=num; i++){
            series += (double) 1/i;
        }
            System.out.println(num+ " order series is: "+series);
    }
}
