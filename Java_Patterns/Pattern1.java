/*
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
 */
import java.util.Scanner;
public class Pattern1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter n value: ");
        num=input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        input.close();
    }
}