//Rawan Mohammed AbdelTawab
//20216116
package assignment2;
import java.util.Scanner;
public class assignment2_1 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int N =SC.nextInt();
        for(int i = N ; i >= 1 ; i--){
            for(int j = i ; j >= 1 ;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}