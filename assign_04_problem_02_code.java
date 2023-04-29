//Rawan Mohammed AbdelTawab
//20216116
package assignment_4;
import java.util.*;
public class Assignment_4 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int arr[]=new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i]=SC.nextInt();
            if(arr[i] > 10){
                continue;
            }
            System.out.println("A["+i+"] = "+arr[i]);
        }
    }
}