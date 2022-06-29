package Arrays;

import java.util.Arrays;

class Choclate_Distribution {
    
    static int distribution(int arr[], int n, int m)
    {
        int min_sum = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int i;
        for(i=0;i<=n-m;i++)
        {
            int diff  = arr[i+m-1] - arr[i];
            if(diff <   min_sum)
                min_sum = diff;
        }
        return min_sum;
    }

    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23,
            25, 41, 30, 40, 28,
            42, 30, 44, 48, 43, 50};
        int n = 17;
        int m=7;
        System.out.println(distribution(arr, n , m));
    }
}
