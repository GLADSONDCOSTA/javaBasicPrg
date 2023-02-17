import java.util.Scanner;

import javax.print.event.PrintJobListener;

class factorial{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=1;
        System.out.println("Enter the Number");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            r=r*i;
        }
        System.out.print(r);
    }
}