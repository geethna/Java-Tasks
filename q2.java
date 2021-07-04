import java.util.*;  
public class Shape{

     public static void main(String []args){
        int[] arr = new int[]{100,200,300};
        int i = 4;
        try{
            arr[i] = 1;
        }
        catch (ArrayIndexOutOfBoundsException e){
            i = 0;
            arr[i] = 1;
        }
        System.out.println(arr[0]);
     }
}