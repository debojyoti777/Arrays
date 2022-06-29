package Arrays;

public class Given_pair_sum {
    
    static boolean sum(int[] arr, int k)
    {
        int l, r, i;
        int n = arr.length;

        for (i = 0; i < n; i++) {
            
            if(arr[i] > arr[i+1])
                break;
        }

        l = (i+1)%n;
        r = i;

        while(l != r)
        {
            int z = arr[l] +arr[r];
            if(z == k )
                return true;
            
            if(z < k)
                l = (l+1) % n;
            else    
                r = (n + r - 1) % n ;
        }
        return false;
    }

    static boolean search(int[] nums, int target) {
        
        int left = 0; 
        int right = nums.length-1;
        
        while(left <= right){
            
            // calcualating the mid point
            int mid = left + (right-left)/2;
            
            if(target == nums[mid]) 
                return true;
            
            // left sorted array
           else if(nums[left] < nums[mid]){
               
               // ex [3,4,5,6,1,2], target = 4
               if(target < nums[mid] && target >= nums[left])
                   right = mid-1;
               else
                   left = mid+1;
            }
            
            // right sorted part
            else if (nums[mid] < nums[left]){
                
                // ex [1,2,3,4,0], target = 4
                if(target > nums[mid] && target <= nums[right])
                    left = mid+1;
                else
                    right = mid-1;
            }
            
            // if duplicate element are encountered
            else{
                left++;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        
        int arr[] = {11, 15, 6, 8, 9, 10};
        int k = 16;
        System.out.println(search(arr, k));
    }
}
