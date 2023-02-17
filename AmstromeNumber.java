import java.util.Scanner;

import javax.print.event.PrintJobListener;

class amstromeNo{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem,sum=0,temp;
        System.out.println("Enter the Number");
        int x = sc.nextInt();
        temp=x;
        while(temp!=0){
            rem=temp%10;
            rem=rem*rem*rem;
            sum+=rem;
            temp=temp/10;
        }
        if(x == sum){
            System.out.println(x+" is Amstrome Number");
        }else{
            System.out.println(x+" is Not Amstrome Number");
        }
    }
}