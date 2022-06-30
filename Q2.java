package Day1;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0)
            return new ArrayList();

        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer>list = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0|| j==i-1){
                    list.add(1);
                }else{
                    list.add(res.get(i-2).get(j)+res.get(i-2).get(j-1));
                }
            }
            res.add(list);
        }
        return res;
    }
}
