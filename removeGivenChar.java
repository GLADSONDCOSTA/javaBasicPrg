import java.security.cert.X509CRLSelector;
import java.util.*;

class removeGivenChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the String");
        String st = sc.next();
        String st2 = st.replace("a","");
        System.out.println(st2);
    }
}
