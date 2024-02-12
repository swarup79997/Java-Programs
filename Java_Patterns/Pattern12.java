/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */
import java.util.Scanner;
public class Pattern12{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter n value: ");
        num=input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("  ");
        }
        input.close();
    }
}