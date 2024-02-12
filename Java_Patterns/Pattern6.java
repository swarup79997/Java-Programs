/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
import java.util.Scanner;
public class Pattern6{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter n value: ");
        num=input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("  ");
        }
        input.close();
    }
}