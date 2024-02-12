/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
import java.util.Scanner;
public class Pattern8{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter n value: ");
        num=input.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                sum=sum+1;
                System.out.print(sum+" ");
            }
            System.out.println("  ");
        }
        input.close();
    }
}