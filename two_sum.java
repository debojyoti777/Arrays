package Arrays;

import java.util.Arrays;

public class two_sum {

    static int[] sum(int[] arr, int k)
    {
        int n = arr.length;
        int x[] = new int[n];

        for (int i = 0; i < x.length; i++) {
            x[i] = arr[i];
        }
        int[] ans =new int[2];
        int l =0, r=n-1, flag =0, i;
        int left_i=0 , right_i=0;
        Arrays.sort(arr);
        while(l <= r)
        {
            int z = arr[l] + arr[r];
            if( z == k)
            {    
                flag = 1; 
                break;     
            }
            
            if(z > k)
                r--;
            else    
                l++;
        }
        if(flag == 1)
        {
            for (i = 0; i < x.length; i++) {
                
                if(x[i] == arr[l])
                {
                    left_i = i;
                    break;
                }
            }
            for (i = 0; i < x.length; i++) {
                
                if(arr[r] == x[i] && i != left_i)
                {
                    right_i = i;
                    break;
                }
            }
        ans[0] = left_i;
        ans[1] = right_i;
        }
        
        return ans;
}

    public static void main(String[] args) {
        
        int arr[]={1, 4, 45, 6, 10, 8 };
        int k=16;
        System.out.println(Arrays.toString(sum(arr, k)));
    }
    
}
