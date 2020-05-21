package com.wangmh.interview.linked;

import com.wangmh.interview.wmh.ListNode;

import java.util.List;

/**
* <pre>
*   @author : mh.wang
*   @date   : 2020/5/20 17:10
*   @desc   : LeetCode0024
* </pre>
 *
 * 24. 两两交换链表中的节点
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 *
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 * 通过次数103,763提交次数158,195
 *
*/
public class LeetCode0024 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return  head;
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);

        LeetCode0024 sol = new LeetCode0024();
        System.out.println(sol.swapPairs(l));
    }
}
