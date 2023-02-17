import java.util.Scanner;

public class DublicateString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.next();
        char[] ch = st.toCharArray();
        for(int i=0;i<=st.length()-1;i++){
            for(int j=i+1;j<=st.length()-1;j++){
                if(ch[i]==ch[j]){
                    System.out.print(ch[j]);
                }
            }
        }
    }
}
    

