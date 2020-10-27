package com.wh.no.no18;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wanghao
 * @date 2020/10/24 0024 18:07
 * @discription
 */
public class Test {

    public  static  void  main(String args[]){
        int[] test =  {1, 0, -1, 0, -2, 2};
        int target = 0;
        Solution solution = new Solution();
        List<List<Integer>> res = new LinkedList<>();
        res = solution.fourSum(test, target);

        int[] test1 =  {-2,-1,-1,1,1,2,2};
        target = 0;
        solution = new Solution();
        res = new LinkedList<>();
        res = solution.fourSum(test1, target);

        int i = 2;
    }
}
