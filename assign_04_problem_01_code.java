//Rawan Mohammed AbdelTawab
//20216116
package assignment2;
import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int arr[]=new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i]=SC.nextInt();
            if(arr[i] >0){
                arr[i] = 1;
            }
            if(arr[i] <0){
                arr[i] = 2;
            }
            if(arr[i] == 0){
                arr[i] = 0;
            }
            System.out.print (arr[i]+" ");
        }
    }
}