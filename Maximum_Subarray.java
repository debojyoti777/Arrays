package Arrays;
public class Maximum_Subarray {
    
    static class pair{
        int start =0;
        int end = 0;
        int max= Integer.MIN_VALUE;
    }

    static pair max_subarray(int arr[] , int n)
    {
        pair obj = new pair();
        int curr_max = 0;
        int s=0;
        int i;
        for(i=0;i<n;i++)
        {
            curr_max += arr[i];
            if(curr_max > obj.max)
            {
                obj.max = curr_max;
                obj.start = s;
                obj.end = i;
            }
            
            if(curr_max <0)
            {
                curr_max =0;
                s=i+1;
            }
        }
        return obj;
    }

    public static void main(String[] args) {
        int n=8;
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        pair minmax = max_subarray(arr , n);
        System.out.println("The Maximum No is : " + minmax.max);
        System.out.println("The start is : " + minmax.start);
        System.out.println("The end is : " + minmax.end);
    }
}
