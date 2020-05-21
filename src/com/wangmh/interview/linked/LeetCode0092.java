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
public class LeetCode0092 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return head;
        if (m == 0 || n == 0) return head;
        if(m >= n) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        for (int i = 0; i < m -1; i++) {
            p = p.next;
        }

        ListNode a = p; ListNode b = a.next;ListNode c = b.next;
        for (int i = m+1;i<=n;i++){
            ListNode d = c.next;
            c.next = b;
            b = c;
            c = d;
        }
        a.next.next = c;
        a.next = b;
        return dummy.next;
    }
}
