import java.util.Scanner;

import javax.print.event.PrintJobListener;

class Vowels{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String x = sc.next();
        x=x.toLowerCase();
        int vcount=0,dcount=0,ccount=0,scount=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u'){
                vcount++;
            }else if(x.charAt(i)>='0' && x.charAt(i)<='9'){
                dcount++;
            }else if(x.charAt(i)>='a' && x.charAt(i)<='z'){
                ccount++;
            }else{
                scount++;
            }
        }
        System.out.println("Total Vowels in String = "+vcount);
        System.out.println("Total Digits in String = "+dcount);
        System.out.println("Total Constents in String = "+ccount);
        System.out.println("Total Special char in String = "+scount);
    }
}