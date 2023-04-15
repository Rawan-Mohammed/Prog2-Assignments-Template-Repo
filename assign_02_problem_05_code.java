//Rawan Mohammed AbdelTawab
//20216116
package assignment2;
import java.util.*;
public class Assignment2 {
    static void Prime(int num){
         int i, m,flag=0;
         m=num/2;
         if(num==0||num==1){
             System.out.println("Not");
         }
         else{
             for(i=2;i<=m;i++){
                 if(num%i==0){
                     System.out.println("Not");
                     flag=1;
                     break;
                 }
             } 
             if(flag==0){
                 System.out.println("Prime");
             }
         }
    }
    public static void main(String[] args) {
       Scanner SC = new Scanner(System.in);
        int size = SC.nextInt();
        int myArray[] = new int [size];
        for(int i=0; i<size; i++) {
         myArray[i] = SC.nextInt();
      }
        for(int i=0;i<=myArray.length-1;i++){
            Prime(myArray[i]);
         }
    }
}
