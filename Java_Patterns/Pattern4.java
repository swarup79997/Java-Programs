/*
* * * * *
* * * *
* * *
* *
*
 */
import java.util.Scanner;
public class Pattern4{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter n value: ");
        num=input.nextInt();
        for(int i=num;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        input.close();
    }
}