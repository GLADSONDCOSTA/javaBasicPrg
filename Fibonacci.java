import java.util.Scanner;

class Fibonacci{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th number");
        int count=sc.nextInt();
        int n1=0,n2=1,n3,i;
        System.out.println(n1+" "+n2);
        for(i=2;i<=count;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}