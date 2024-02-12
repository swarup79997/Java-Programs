/*
* * * * *
*       *
*       *
*       *
* * * * *
 */
import java.util.Scanner;
public class Pattern2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter n value: ");
        num=input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||j==1||i==num||j==num){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
        input.close();
    }
}