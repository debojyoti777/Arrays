package Arrays;

import java.util.Arrays;

public class Kth_Largest_Element {
    
    static int count(int arr[] , int mid )
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= mid)
                count++;
        }
        return count;
    }
    
    static int kthelement(int arr[], int k)
    {
        int low = Integer.MAX_VALUE;
        int high  = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            low = Math.min(low, arr[i]);
            high = Math.max(high, arr[i]); 
        }

        while(low<high)
        {   
        
            int mid= low + (high- low) /2;
            if(count(arr, mid) > k)
                low= mid+1;
            else
                high = mid;
        }
        return low;
    }

    static int element(int[] arr, int k)
    {
        Arrays.sort(arr);
 
        // Return k'th element in
        // the sorted array
        return arr[arr.length - k];
    }


    public static void main(String[] args) {
        
        int arr[] = {3,2,1,5,6,4};
        int k =3;
        System.out.print(kthelement(arr, k));
    }
}
