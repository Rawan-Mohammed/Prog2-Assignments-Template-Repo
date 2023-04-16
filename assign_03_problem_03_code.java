//Rawan Mohammed AbdelTawab
//20216116
package assignment2;
import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=n*4;j++){
                if(j%4==0){
                    System.out.print("PUM");
                    System.out.println("");
                }
                else{
                    System.out.print(j+" ");
                }
            }
            break;
        }
    }
}
