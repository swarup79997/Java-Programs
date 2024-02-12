/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
import java.util.Scanner;
public class Pattern7{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter n value: ");
        num=input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println("  ");
        }
        input.close();
    }
}