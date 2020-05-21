package com.wangmh.interview.wmh;

/**
* <pre>
*   @author : mh.wang
*   @date   : 2020/5/16 18:21
*   @desc   : ListNode
* </pre>
*/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        ListNode head = this;
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append(" ");
            head = head.next;
        }
        return sb.toString();
    }
}
