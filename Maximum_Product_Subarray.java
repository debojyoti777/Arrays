package Arrays;

public class Maximum_Product_Subarray {
    
    static int product(int arr[])
    {
        int n= arr.length;
        int i;

        int max_so_far = arr[0];
        int max_ending_here = arr[0];
        int min_ending_here = arr[0];
        
        for(i=1;i<n;i++)
        {
            int temp = Math.max(Math.max(arr[i], arr[i] * max_ending_here), arr[i] * min_ending_here);
            min_ending_here = Math.min(Math.min(arr[i], arr[i] * max_ending_here), arr[i] * min_ending_here);
            max_ending_here = temp;
            max_so_far = Math.max(max_so_far, max_ending_here);

        }
        return max_so_far;
    }

    public static void main(String[] args) {
        
        int arr[] = { 1, -2, -3, 0, 7, -8, -2 };
        System.out.println(product(arr));
    }
}
