package Arrays;

public class Container_with_most_water {
    
    static int water(int[] arr)
    {
        int n = arr.length;
        int l=0, r=n-1,
        max_area=0;
        while(l<r)
        {
            max_area = Math.max(max_area, Math.min(arr[r], arr[l]) *(r-l));

            if(arr[l] < arr[r])
                l++;
            else
                r--;

        }

        return max_area;
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 5, 4, 3};
        System.out.println(water(arr));
    }
}
