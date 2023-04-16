//Rawan Mohammed AbdelTawab
//20216116
package assignment2;
import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int arr[]=new int[n];
        for(int i =1 ; i<=n ; i++){
            int max;
            int min;
            int sum=0;
            int x=SC.nextInt();
            int y=SC.nextInt();
            if(x>y){
                max=x;
                min=y;
            }
            else{
                max=y;
                min=x;
            }
            for(int j = min+1 ; j < max ; j++){
                if( j % 2 == 1 )
                    sum+=j;
            }
            arr[i-1]=sum;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}