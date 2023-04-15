//Rawan Mohammed AbdelTawab
//20216116
package assignment2;
import java.util.Scanner;
public class assignment2_1 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int N =SC.nextInt();
        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j <= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
