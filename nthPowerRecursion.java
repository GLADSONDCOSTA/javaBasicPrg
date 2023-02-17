import java.util.Scanner;
import java.util.*;

class nthPower{
    
    static int power(int n,int m){
        if(m==0)
        return 1;
        if(n==0)
        return 0;

        return n*power(n,m-1);

    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int n=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int m=sc.nextInt();
        System.out.println(power(n,m));
    }
}