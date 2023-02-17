import java.util.Scanner;

class twoStringEquals{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1");
        String s1 = sc.next();
        System.out.println("Enter the string2");
        String s2 = sc.next();
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
    }
}