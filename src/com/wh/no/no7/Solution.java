package com.wh.no.no7;

/**
 * @author wanghao
 * @date 2020/10/21 0021 1:37
 * @discription
 */
public class Solution {
    public int reverse(int x) {
        int res = 0;
        if(x == 0){
            return  res;
        }
        if (0 > x){
            res = -1;
        }   else {
            res = 1;
        }
        char[] xChar= Integer.toString(x).toCharArray();
        int tmp = (int)xChar[xChar.length-1] - (int)'0';
        int hh = 0;
        for(int i = xChar.length-2; i > -1; i--){
            if(xChar[i] == '-'){
                continue;
            }
            hh = (int)xChar[i] - (int)'0';
            tmp = tmp * 10 + hh;

        }
        res = tmp * res;
        return  res;
    }
}
