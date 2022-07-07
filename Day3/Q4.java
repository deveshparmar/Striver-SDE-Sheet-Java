package Day3;

import java.util.ArrayList;
import java.util.List;

public class Q4 {
    public List<Integer> majorityElement(int[] nums) {
        int num1=-1;
        int num2=-1;
        int c1=0;
        int c2=0;
        List<Integer>ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1)
                c1++;
            else if(nums[i]==num2)
                c2++;
            else if(c1==0){
                num1 = nums[i];
                c1=1;
            }else if(c2==0){
                num2 = nums[i];
                c2=1;
            }else{
                c1--;
                c2--;
            }
        }
        int threshold = nums.length/3;
        c1=0;
        c2=0;
        for(int num: nums){
            if(num==num1){
                c1++;
            }else if(num==num2){
                c2++;
            }
        }
        if(c1>threshold){
            ans.add(num1);
        }
        if(c2>threshold){
            ans.add(num2);
        }
        return ans;
    }
}
