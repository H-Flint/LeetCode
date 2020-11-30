package com.wh.no.no13;

/**
 * @author wanghao
 * @date 2020/10/21 0021 1:37
 * @discription
 */
class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int i = 0;
        int romanLength = s.length();
        while (i < romanLength) {
            if (i < (romanLength - 1)) {
                if (romanCharToInt(s.charAt(i)) < romanCharToInt(s.charAt(i + 1))) {
                    res += (romanCharToInt(s.charAt(i + 1)) - romanCharToInt(s.charAt(i)));
                    i = i + 2;
                    continue;
                }
            }
            res += romanCharToInt(s.charAt(i));
            i++;
        }

        return res;
    }

    public int romanCharToInt(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return  0;
    }
}


