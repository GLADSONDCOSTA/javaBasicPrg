import java.util.Scanner;

class substring{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.next();
        for(int i=0;i<s1.length();i++){
            //StringBuffer sub = new StringBuffer(s1.length()-i);
            for(int j=i+1;j<=s1.length();j++){
               // sub.append(s1[j]);
                System.out.println(s1.substring(i, j));
            }

        }
    }
}