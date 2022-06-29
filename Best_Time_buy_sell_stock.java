package Arrays;

import java.util.ArrayList;

public class Best_Time_buy_sell_stock {
    
    static int maxProfit(int arr[], int n)
    {
        int buy = arr[0] , max = 0;
        int i;
        for(i=0;i<n;i++)
        {
            if(arr[i] < buy)
                buy = arr[i];

            if((arr[i] - buy) > max)
                max = arr[i] - buy;
        }
        return max;
    }



    static ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
        // code here
        ArrayList<ArrayList<Integer> > array = new ArrayList<ArrayList<Integer>>(1);
        array.add(new ArrayList<Integer>(1));
        int buy = arr[0] , max = 0;
        int i, x=0;
        for(i=0;i<n;i++)
        {
            if(arr[i] < buy)
                buy = arr[i];

            if((arr[i] - buy) > max)
            {
                max = arr[i] - buy;
    
                array.get(x).add(buy, max);
                x++;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        
    int prices[] = { 7, 1, 5, 6, 4 };
    int n = prices.length;
    System.out.println(stockBuySell(prices, n));
    }
}
