package com.wh.no.no18;

import java.util.*;

/**
 * @author wanghao
 * @date 2020/10/24 0024 18:07
 * @discription
 */
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> tmp = new LinkedList<Integer>();
        List<String>  onlyList = new ArrayList<String >();
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                for (int k = j+1; k < nums.length; k++){
                    for (int l = k+1; l < nums.length; l++){
                        if ((nums[i] + nums[j] + nums[k] + nums[l]) == target){
                            tmp.add(nums[i]);
                            tmp.add(nums[j]);
                            tmp.add(nums[k]);
                            tmp.add(nums[l]);
                            Collections.sort(tmp);
                            String sss = tmp.toString();
                            if(onlyList.contains(sss)){
                                tmp = new LinkedList<Integer>();
                                continue;
                            }
                            if (tmp.size() > 0){
                                res.add(tmp);
                            }
                            onlyList.add(sss);
                            tmp = new LinkedList<Integer>();
                        }
                    }
                }
            }
        }
    return  res;
    }
}