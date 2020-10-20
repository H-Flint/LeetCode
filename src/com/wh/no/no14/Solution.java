package com.wh.no.no14;

/**
 * @author wanghao
 * @date 2020/10/20 0020 22:40
 * @discription
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return  "";
        }
        if (strs.length == 1){
            return  strs[0];
        }
        String tmp = strs[0];
        for (int i = strs[0].length(); i > 0; i--){
            boolean find = false;
            for (int j = 1; j < strs.length; j++){
                if(strs[j].length() < i){
                    tmp = tmp.substring(0, i-1);
                    break;
                }
                if(!tmp.equals(strs[j].substring(0, i))) {
                    tmp = tmp.substring(0, i-1);
                    break;
                }
                if (j == strs.length -1){
                    find = true;
                }
            }
            if(find){
                break;
            }
        }
        return  tmp;
    }
}
