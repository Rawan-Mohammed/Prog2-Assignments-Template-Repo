//Rawan Mohammed AbdelTawab
//20216116
package assignment2;
import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        if(n==1){
            System.out.print(0);
        }else{
            int n1 = 0;
            int n2 = 1;
            int n3;
            System.out.print(n1+" "+n2+" ");
            for(int i = 2 ; i < n ; i++){
                n3=n1+n2;
                System.out.print(n3+" ");
                n1=n2;
                n2=n3;
            }
        }
    }
}
