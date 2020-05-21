package com.wangmh.interview.linked;

import com.wangmh.interview.wmh.ListNode;

/**
 * <pre>
 *   @author : mh.wang
 *   @date   : 2020/5/17 13:29
 *   @desc   : LeetCode0092
 * </pre>
 *
 * 92. 反转链表 II
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 *
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 * 通过次数49,756提交次数99,541
 *
 */

public class LeetCode0092_2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return null;
        if (m == n) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode a = dummy;
        ListNode d = dummy;

        /*
                a表示m位置的前一个节点
                d表示n位置的节点

                b表示m位置的节点
                c表示n位置的节点
         */

        for (int i = 0; i < m - 1; i++) {
            a = a.next;
        }

        for (int i = 0; i < n; i++) {
            d = d.next;
        }

        ListNode b = a.next;
        ListNode c = d.next;

        for (ListNode p = b, q = b.next; q != c; ) {
            ListNode o = q.next;
            q.next = p;
            p = q;
            q = o;
        }

        b.next = c;
        a.next = d;
        return dummy.next;
    }
}
