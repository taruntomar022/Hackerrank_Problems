import java.util.*;

public class Main{

public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    String n = scn.next();
    int k = scn.nextInt();
    
    sum(n,k);
 }
 
 public static void sum(String num, int k){
     if(num.length() == 1){
         System.out.println(num);
         return;
     }
     long res = 0;
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            int val = ch - '0';
            res += val;
        }
        String fn = ""+res*k;

        sum(fn,1);
    
 }
}