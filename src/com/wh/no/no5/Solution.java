package com.wh.no.no5;

/**
 * @author wanghao
 * @date 2020/10/21 0021 1:01
 * @discription
 */
class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int length = s.length();
//        if(length == 1){
//            return  s;
//        }
        for (int i = 0; i < length - res.length(); i++){
            for (int right = length - 1; right >= i && (right - i + 1) >= res.length(); right --){
                int ll = i;
                int rr = right;
                boolean match = false;
                while (s.charAt(ll) == s.charAt(rr)){
                    if ((ll == rr) || (rr - ll) == 1){
                        match = true;
                        break;
                    }   else {
                        ll ++;
                        rr --;
                    }
                }
                if(match){
                    String tmp = s.substring(i, right+1);
                    if(tmp.length() > res.length()){
                        res = tmp;
                    }
                }

            }
        }

        return res;
    }
}