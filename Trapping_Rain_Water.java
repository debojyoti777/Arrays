package Arrays;

public class Trapping_Rain_Water {
    
    static int tapping(int arr[])
    {
        int n = arr.length;
        int left_max = 0 , right_max=0;
        int low =0, high = n-1;
        int result=0;
        while(low <= high)
        {
            if(arr[low] < arr[high])
            {
                if(arr[low] > left_max)
                    left_max = arr[low];
                else
                    result += (left_max - arr[low]);
                low++;
            }
            else
            {
                if(arr[high] > right_max)
                    right_max = arr[high];
                else
                    result += (right_max - arr[high]);
                high --;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
        int arr[] = {0,3,0,2,0,4};
        System.out.println(tapping(arr));
    }
}
