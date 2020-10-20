package com.wh.no.no1;

/**
 * @author wanghao
 * @date 2020/10/20 0020 23:08
 * @discription
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        String numsString = "";
        for(int i = 0; i < nums.length; i++){
            String tmp = Integer.toString(nums[i]);
            numsString = numsString + "," + tmp;
        }
        numsString += ",";
        for (int i = 0; i < nums.length; i++){
            String tmp = "," + Integer.toString(target - nums[i]);
            int firstFind =  numsString.indexOf(tmp);
            if(firstFind != -1){
                int last;
                if(nums[i] + nums[i] == target){
                    if(firstFind+1 == nums.length){
                        continue;
                    }
                    firstFind =  numsString.indexOf(tmp, firstFind+1);
                    if(firstFind == -1){
                        continue;
                    }
                    String firstString = numsString.substring(0, firstFind);
                    String firstStringTrun = numsString.substring(0, firstFind).replace(",", "");
                    last = firstString.length() - firstStringTrun.length();
                }   else {
                    String firstString = numsString.substring(0, firstFind);
                    String firstStringTrun = numsString.substring(0, firstFind).replace(",", "");
                    last = firstString.length() - firstStringTrun.length();
                }
                res[0] = i;
                res[1] = last;
                break;
            }

        }
        return  res;
    }
}
