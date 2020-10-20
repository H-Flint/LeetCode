package com.wh.no.no3;

/**
 * @author wanghao
 * @date 2020/10/21 0021 1:01
 * @discription
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] dumpList = new  boolean[500];
        char[] charStr = s.toCharArray();
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            int temp = 1;
            dumpList[(int)charStr[i]] = true;
            for(int j =  i+1; j < s.length(); j++){
                if (dumpList[(int)charStr[j]] ){
                    break;
                }   else {
                    dumpList[(int)charStr[j]] = true;
                    temp ++;
                }
            }
            if(max < temp){
                max = temp;
            }
            dumpList = new  boolean[500];

        }
        return max;
    }
}