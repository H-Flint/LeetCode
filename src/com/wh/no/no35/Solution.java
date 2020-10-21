package com.wh.no.no35;

/**
 * @author wanghao
 * @date 2020/10/21 0021 20:46
 * @discription
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        for (int ite :nums){
            if(ite == target || ite > target){
                return res;
            }   else{
                res++;
            }
        }

        return res;
    }
}