package com.wh.no.no6;


/**
 * @author wanghao
 * @date 2020/10/21 0021 1:01
 * @discription
 */
class Solution {
    public String convert(String s, int numRows) {
        String res = "";
        char [] start = s.toCharArray();
        char [] mid =new  char[s.length() * numRows];
        System.out.println("tset" +  java.lang.String.valueOf(mid));
        int colm = 1;
        int rown = 0;
        for (int i = 0; i < start.length; i++){
            if (colm == (numRows -1)){
                colm = 1;
            }
            if (rown == numRows){
                rown = 0;
            }
            

            mid[i] = start[i];
            rown ++;
        }

        return  res;

    }
}