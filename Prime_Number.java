import java.util.Scanner;

class primeex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        if(n==0 || n==1){
            System.out.println(n+" is not Prime Number");
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    System.out.println(n+" is not Prime Number");
                    break;
                }else{
                    System.out.println(n+" is Prime Number");
                    break;
                }
            }
        }
    }
    
}
