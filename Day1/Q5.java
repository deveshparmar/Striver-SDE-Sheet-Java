package Day1;

public class Q5 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int c0=0,c1=0,c2=0;

        for (int num : nums) {
            if (num == 0)
                c0++;
            if (num == 1)
                c1++;
            else if (num == 2)
                c2++;
        }
        for(int i=0;i<c0;i++)
            nums[i]=0;
        for (int i=c0;i<c0+c1;i++)
            nums[i]=1;
        for (int i=c0+c1;i<n;i++)
            nums[i]=2;
    }
}
