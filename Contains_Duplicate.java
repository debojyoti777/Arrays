package Arrays;

import java.util.ArrayList;


public class Contains_Duplicate {
    
    static boolean duplicate(int arr[] , int n)
    {
        ArrayList<Integer> al =  new ArrayList<Integer>();
        int i;
        for(i=0;i<n;i++)
        {
            if(al.contains(arr[i]))
                return true;
            else
                al.add(arr[i]);
        }
        return false;
    }



    public static void main(String[] args) {
        int n=10;
        int arr[] = { 15,32,55,1,26,99,45,12,63,69};
        System.out.println(duplicate(arr, n));
    }
}
