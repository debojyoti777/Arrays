package Arrays;

import java.util.Arrays;

public class Product_array_except_self {
    
    static int[] product(int arr[])
    {   
        int temp =1;
        int n=arr.length;
        int [] prod = new int[n];
        int i;
        for(i = 0;i<n;i++)
            prod[i] = 1;

        for(i = 0;i<n;i++)
        {
            prod[i] = temp;
            temp *= arr[i];
        }  
        
        temp =1;

        for(i = n-1; i>=0;i--)
        {
            prod[i] *= temp;
            temp *= arr[i];
        } 
        return prod;
    }

    public static void main(String[] args) {
        
        int[] arr = { 12 , 0 };
        System.out.println(Arrays.toString(product(arr)));
    }
}
