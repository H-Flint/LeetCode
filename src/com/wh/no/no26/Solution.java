package com.wh.no.no26;

/**
 * @author wanghao
 * @date 2020/10/27 0027 21:35
 * @discription
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int tmp = nums[0];
        int res = 1;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == tmp){
                continue;
            }
            tmp = nums[i];
            nums[res] = tmp;
            res ++;
        }
        return res;
    }
}