package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Q2 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]>s = new Stack<>();
        s.add(intervals[0]);

        for(int i=1;i< intervals.length;i++){
            int startPoint2 = intervals[i][0];
            int endPoint2 = intervals[i][1];

            int[]pop = s.pop();
            int startPoint1 = pop[0];
            int endPoint1 = pop[1];

            int endPointMax = Math.max(endPoint1,endPoint2);

            if(endPoint1>=startPoint2){
                int[] merge = new int[]{startPoint1,endPointMax};
                s.add(merge);
            }else{
                s.add(pop);
                s.add(intervals[i]);
            }
        }
        int[][] ans = new int[s.size()][];
        for(int i=s.size()-1;i>=0;i--){
            int[] pop = s.pop();
            ans[i][0] = pop[0];
            ans[i][1] = pop[1];
        }

        return ans;
    }
}
