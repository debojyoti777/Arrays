package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class three_sum {
    
    static Boolean check(List<List<Integer>> sumarr, List<Integer> list)
    {
        Collections.sort(list);
        int i;
        int flag =0;
        ArrayList<Integer> aray = new ArrayList<Integer>();
        ArrayList<Integer> index_i = new ArrayList<Integer>();
        for(i=0;i<sumarr.size();i++)
        {
            Collections.sort(sumarr.get(i));

            if(sumarr.get(i).get(0) == list.get(0))
            {    
                flag = 1;
                aray.add(i);
            }
        }
        if(flag == 1)
        {
                for(i=0; i<aray.size();i++)
                {
                    if(sumarr.get(aray.get(i)).get(1) == list.get(1))
                        flag = 2;
                    else
                    {
                        index_i.add(i);
                    }    
                }
        }
        for(i=0;i<index_i.size();i++)
            aray.remove(index_i.get(i));


        if(flag == 2) 
        {
            for(i=0; i<aray.size();i++)
            {
                if(sumarr.get(aray.get(i)).get(2) == list.get(2))
                    flag = 3;
            }
        }
        if(flag == 3)
            return true;
        return false;
    }

    static List<List<Integer>> bubblesort(List<List<Integer>> sumarr)
    {
        int i, j, temp1, temp2, temp3;
        for (i = 0; i < sumarr.size() - 1; i++) 
        {

            for (j = 0; j < sumarr.size() - i - 1; j++) 
            {
                if (sumarr.get(j).get(0) > sumarr.get(j+1).get(0)) 
                {

                    temp1 = sumarr.get(j).get(0);
                    sumarr.get(j).remove(0);
                    sumarr.get(j).add(0, sumarr.get(j+1).get(0));
                    sumarr.get(j+1).remove(0);
                    sumarr.get(j+1).add(0, temp1);


                    temp2 = sumarr.get(j).get(1);
                    sumarr.get(j).remove(1);
                    sumarr.get(j).add(1, sumarr.get(j+1).get(1));
                    sumarr.get(j+1).remove(1);
                    sumarr.get(j+1).add(1, temp2);


                    temp3 = sumarr.get(j).get(2);
                    sumarr.get(j).remove(2);
                    sumarr.get(j).add(2, sumarr.get(j+1).get(2));
                    sumarr.get(j+1).remove(2);
                    sumarr.get(j+1).add(2, temp3);

                }
            }
        }
        return sumarr;
    }


    static List<List<Integer>> sum(int[] arr)
    {
        List<List<Integer>> sumarr = new ArrayList<List<Integer>>();
        
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            HashSet<Integer> hash = new HashSet<Integer>();
            for (int j = i+1; j < n; j++) 
            {
                int x = -(arr[i] + arr[j]);
                if(hash.contains(x))
                {
                    if(!check(sumarr, Arrays.asList(arr[j], arr[i], x)))
                        sumarr.add(new ArrayList<Integer>(Arrays.asList(arr[j], arr[i], x)));
                }    
                else
                    hash.add(arr[j]);
            }
        }
        sumarr = bubblesort(sumarr);
        return sumarr;
    }
    public static void main(String[] args) {
        
        int arr[] = {0};
        System.out.println(
            sum(arr)
        );
    }
}
