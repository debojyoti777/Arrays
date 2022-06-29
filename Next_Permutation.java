package Arrays;

import java.util.Arrays;

public class Next_Permutation {
    
    static int[] reverse(int arr[] ,int low, int right)
    {

        while(low< right)
        {
            int temp = arr[low];
            arr[low] = arr[right];
            arr[right] = temp;

            low++;
            right--;

        }
        return arr;
    }

    static int[] swap(int arr[] ,int low, int right)
    {
       
            int temp = arr[low];
            arr[low] = arr[right];
            arr[right] = temp;

        return arr;
    }


    static int[] findPermutation(int arr[] , int n)
    {
        int i, x=0;
        int flag = 0;
        int index=0;
        int min = Integer.MAX_VALUE;
        for(i=n-1;i>0;i--)
        {
            if(arr[i] > arr[i-1])
            {
                flag = 1;
                x = i;
                break;
            }
        }
            if(flag != 1)
                return reverse(arr, 0, n-1);
        
        int pivot = x-1;
        for(i=n-1; i>pivot;i--)
        { 
            int diff = arr[i] -  arr[pivot];
            if((arr[pivot] < arr[i]) && (diff < min))
            {
                min = diff;
                index = i;
            }
        }
        arr = swap(arr, pivot, index);
        arr = reverse(arr, pivot +1, n-1);
        return arr;
    }
        


    public static void main(String[] args) {
        
        int data[] = { 1 , 3, 5, 4, 2 };
        int n= 5;
        System.out.println(Arrays.toString(findPermutation(data,  n)));
    }
}