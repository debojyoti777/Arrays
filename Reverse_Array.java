package Arrays;
class Reverse_Array
{
    // static int[] reverse(int arr[] , int n)
    // {
    //     int start = 0;
    //     int end = n-1;
    //     while(start<=end)
    //     {
    //        int temp = arr[start];
    //        arr[start] = arr[end];
    //        arr[end] = temp;
    //        start++;
    //        end--;
    //     }
    //     return arr;
    // }

    static void reverse(int arr[] , int start, int end)
    {
        if(start >= end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start+1, end-1);
    }


    public static void main(String[] args) {
        int arr[]={15,32,55,1,26,99,45,12,63,69};
        int n=10;
        int i;
        System.out.print("Original Array is : ");
        for(i=0;i<n;i++)
            System.out.print(arr[i] + " ");
        reverse(arr, 0 , 9);
        System.out.println();
        System.out.print("Reversed Array is : ");
        for(i=0;i<n;i++)
            System.out.print(arr[i] + " ");
    }
    
}