package Arrays;

import java.util.Arrays;

public class Repeat_Missing_no_Array {
    
    static int[] missing(int arr[])
    {
        int[] result= new int[2];
        for (int i = 0; i < arr.length; i++) {
            int abs_value = Math.abs(arr[i]);
           
            if(arr[abs_value-1] > 0)
            {   arr[abs_value -1]  = -arr[abs_value -1];
                System.out.print(arr[abs_value -1]+ " "); }
            else
                result[0]  = abs_value;
        }

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] > 0)
                result[1] = i +1;
        }
        return result;
    }


    public static void main(String[] args) {
        
        int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
        int[] result = missing(arr);
        System.out.println(Arrays.toString(result));
    }
}
