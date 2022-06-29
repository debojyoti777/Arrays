package Arrays;

public class minimum_in_sorted_rotated_array {
    
    static int minimum(int[] arr)
    {
        int n = arr.length;
        int low = 0, high = n-1;

        while(low< high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid] == arr[high])
                high --;
            else if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }

        return arr[high];
    }

    public static void main(String[] args) {
        
        int arr[] = { 5, 6, 1, 2, 3, 4};
        System.out.println(minimum(arr));

    }
}
