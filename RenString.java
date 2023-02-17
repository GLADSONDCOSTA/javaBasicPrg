import java.util.Scanner;

class revString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s2="";
        System.out.println("Enter the String");
        String s1 = sc.next();
        for(int i=s1.length()-1;i>=0;i--){
                s2+=s1.charAt(i);
        }
        System.out.println(s2); 
    }
}