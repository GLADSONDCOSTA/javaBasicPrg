import java.util.Scanner;



class nametoAscii{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String st = sc.next();
        for(int i=0;i<=st.length()-1;i++){
            char c = st.charAt(i);
            int ascii = (int)c;
            System.out.println(ascii);
        }
    }
}