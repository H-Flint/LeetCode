package com.wh.no;


/**
 * @author wanghao
 * @date 2020/10/18 0018 21:34
 * @discriptiong 2. 两数相加
 */
public class no2 {
    public static  void  main(String args[]){
        int test = 872 % 100;

        ListNode aaa = generateListNode("55");
        ListNode bbb = generateListNode("55");
        Solution solution = new  Solution();
        ListNode ccc = solution.addTwoNumbers(aaa, bbb);
        System.out.println(ListNodeToString(ccc));

        aaa = generateListNode("9");
        bbb = generateListNode("9999999991");
        solution = new  Solution();
        ccc = solution.addTwoNumbers(aaa, bbb);

        System.out.println(ListNodeToString(ccc));

    }
    public static  ListNode generateListNode(String strCount){
//        String strCount = Integer.toString(count);
        ListNode res = new ListNode(Character.getNumericValue(strCount.charAt(strCount.length() -1 )));
        ListNode rear = res;
        for(int i = strCount.length() - 2; i > -1; i--){
            ListNode tmp = new ListNode(Character.getNumericValue(strCount.charAt(i)));
            rear.next = tmp;
            rear = tmp;

        }
        return  res;
    }

    public  static  String ListNodeToString(ListNode node){
        String res = "[";
        while (node != null){
            res += Integer.toString(node.val);
            node = node.next;
        }
        res += "]";
        return  res;
    }
}




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0;
        int num2 = 0;
        int count = 0;
        int bei = 1;
        while (l1 != null){
           num1 += l1.val * bei;
            bei *= 10;
           l1 = l1.next;
        }
        bei = 1;
        while (l2 != null){
            num2 += l2.val * bei;
            bei *= 10;
            l2 = l2.next;
        }
        count = num1 + num2;
        String strCount = Integer.toString(count);
        ListNode res = new ListNode(Character.getNumericValue(strCount.charAt(strCount.length() -1 )));
        ListNode rear = res;
        for(int i = strCount.length() - 2; i > -1; i--){
            ListNode tmp = new ListNode(Character.getNumericValue(strCount.charAt(i)));
            rear.next = tmp;
            rear = tmp;

        }
        return  res;
    }
}