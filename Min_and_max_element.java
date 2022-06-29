package Arrays;
class Min_and_max_element
{
    static class pair
    {
        int max;
        int min;
    }

    static pair minandmax(int arr[], int n)
    {
        pair minmax = new pair();
        int i;

        if(n%2 == 0)
        {
            if(arr[0] > arr[1])
            {
                minmax.max = arr[0];
                minmax.min = arr[1];
            }
            else
            {
                minmax.max = arr[1];
                minmax.min = arr[0];
            }
            i=2;
        }
        else
        {
            minmax.max = arr[0];
            minmax.min = arr[0];
            i=1;
        }


        while(i < n-1)
        {
            if(arr[i] > arr[i+1])
            {
                if(arr[i] > minmax.max)
                    minmax.max = arr[i];
                if(arr[i+1] < minmax.min)
                    minmax.min = arr[i+1];
            }
            else
            {
                if(arr[i+1] > minmax.max)
                    minmax.max = arr[i+1];
                if(arr[i] < minmax.min)
                    minmax.min = arr[i];
            }
            i+=2;
        }
        return minmax;
    }

    public static void main(String[] args) {
        
        int n=9;
        int arr[] = {15,23,65,88,96,15,21,33,19};
        pair minmax = minandmax(arr, n);
        System.out.println("The Maximum No is : " + minmax.max);
        System.out.println("The Minimum No is : " + minmax.min);
    }
}
