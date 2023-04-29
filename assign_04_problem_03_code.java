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
         }
        int x=SC.nextInt();
        boolean found=false;
        int j;
        for(j =0 ; j < n ; j++){
            if(x==arr[j]){
                found=true;
                break;
            }
        }
        if (found){
            System.out.println(j);
        }
        else{
            System.out.println("-1");
        }
    }
}