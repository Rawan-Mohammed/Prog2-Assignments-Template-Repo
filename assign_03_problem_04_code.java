//Rawan Mohammed AbdelTawab
//20216116
package assignment2;
import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int arr[]=new int[n];
        int result =0 ;
        for(int i =1 ; i<=n ; i++){
            int x=SC.nextInt();
            int y=SC.nextInt();
            if(x%2==1){
                int result1;
                int z =0;
                for (int j = 0; j < y ; j++){
                    z = z + x + 2*j;
                }
                result1 = z;
                result = result1;
            }
            else{
                int result2;
                int k =0;
                x+=1;
                for (int j = 0; j < y ; j++){
                    k = k + x + 2*j;
                }
                result2 = k;
                result =result2;
            }
            arr[i-1]=result;
        }
        Arrays.stream(arr).forEach(System.out::println);   
    }
}
