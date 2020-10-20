package com.wh.no.no3;

/**
 * @author wanghao
 * @date 2020/10/21 0021 1:01
 * @discription
 */
public class Test{
    public  static  void  main(String  args[]){

        Solution solution = new Solution();
        System.out.println(Integer.toString(solution.lengthOfLongestSubstring("abcabcbb")));
        boolean[] test = new  boolean[10];
        for (boolean ite : test)    {
            System.out.println(ite);
        }

        String strTest = "adsf asdf";
        for (char ite : strTest.toCharArray())    {
            System.out.println(ite);
        }
        System.out.println((int)'c');
        System.out.println((int)'d');

        System.out.println(Integer.toString((int)'2' - (int)'0'));

    }

}