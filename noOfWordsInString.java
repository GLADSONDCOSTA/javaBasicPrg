import java.util.Scanner;

class pnoOfWords {
    public static int count(String s1){
        String[] s2 = s1.split("\\s+");
        return s2.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=sc.next();
        System.out.println(count(s1));
    }
}