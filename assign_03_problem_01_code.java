//Rawan Mohammed AbdelTawab
//20216116
package assignment2;
import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = 1; // number of stars
        int sp =  n - 1; // number of space
        // 1st for loop for rows
        for(int i = 0; i < n ; i++){
            // 2nd for loop for printing spaces
            for(int j = 1; j <= sp; j++){ 
                System.out.print(" ");
            }
            // 3rd for loop for printing stars
            for(int j = 1; j <= st; j++){ 
                System.out.print("*");
            }
            st+=2;
            sp--;
            System.out.println();
        }
    }
}
