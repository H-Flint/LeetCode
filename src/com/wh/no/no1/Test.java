package com.wh.no.no1;

/**
 * @author wanghao
 * @date 2020/10/20 0020 23:08
 * @discription
 */
public class Test {
    public static  void  main(String args[]){
        int[] test = {2, 7, 11, 15};
        Solution solution = new Solution();
        int[] res = solution.twoSum(test, 9);
        System.out.println(Integer.toString(res[0]) + "-- " + Integer.toString(res[1]));

        int[] test1 = {3, 2, 4};
        solution = new Solution();
        res = solution.twoSum(test1, 6);
        System.out.println(Integer.toString(res[0]) + "-- " + Integer.toString(res[1]));
    }
}
