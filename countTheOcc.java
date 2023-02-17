import java.util.Scanner;

class countOcc{
    public static int count(String st,char c){
        int res=0;
        for(int i=0;i<=st.length()-1;i++){
            if(st.charAt(i)==c){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the String");
            String st=sc.next();
            System.out.println("Enter Search Element");
            char c = sc.next().charAt(0);
            System.out.println(count(st, c));
    }
}
