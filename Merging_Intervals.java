package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// class Interval{

//     int start, end;

//     public Interval(int start, int end){

//     this.start = start;
//     this.end = end; 
//     }
// } 

public class Merging_Intervals {

    static int[][] merge(int[][] arr)
    {
        int i;
        int index=0;
        int flag=0;
        LinkedList<int[]> merged = new LinkedList<>();
        Arrays.sort(arr, new Comparator<int[]>() {
            
            @Override              
            public int compare(final int[] entry1, 
                               final int[] entry2) {

                  return entry1[0] -  entry2[0];
            }
          });

        
          for (int[] interval : arr) {
              // if the list of merged intervals is empty or if the current
              // interval does not overlap with the previous, simply append it.
              if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                  merged.add(interval);
              }
              // otherwise, there is overlap, so we merge the current and previous
              // intervals.
              else {
                  merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
              }
          }
          return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        
        int arr[][] = {{6,8},{1,9},{2,4},{4,7}};

        int[][] arr1 = merge(arr);
        for (int i = 0; i < arr1.length; i++)
        {
            System.out.print("[" + arr1[i][0] + ","
                                        + arr1[i][1] + "]");
        }
    }
}
