//Rawan Mohammed AbdelTawab
//20216116
package assignment_4;
import java.util.*;
import java.util.Arrays;
public class Assignment_4 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int arr[]=new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i]=SC.nextInt();
         }
        Arrays.sort(arr);
        for(int j =0 ; j < n ; j++){
            System.out.print(arr[j]+" ");
        }
    }
}