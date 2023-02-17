import java.util.Scanner;

class countNoDigit{
    public static void main(String[] args) {
        int count=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        temp=n;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Number of Digits in "+temp+" = "+count);
            
    }
}