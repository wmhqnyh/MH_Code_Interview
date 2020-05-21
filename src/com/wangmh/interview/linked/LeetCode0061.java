package com.wangmh.interview.linked;

import com.wangmh.interview.wmh.ListNode;

/**
* <pre>
*   @author : mh.wang
*   @date   : 2020/5/20 23:39
*   @desc   : LeetCode0061
* </pre>
 *
 * 61. 旋转链表
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 *
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 * 通过次数61,393提交次数152,439
*/

public class LeetCode0061 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (k == 0) return head;
        int n = 0;
        for (ListNode p = head; p != null; p = p.next) n++;
        k %= n;
        int m = n - k;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode l1 = head;
        ListNode l2 = head;
        while (m > 0) {
            l1 = l1.next;
            m--;
        }
        while (n > 0) {
            if (l1 != null) {
                head.next = l1;
            }else {
                head.next = l2;
            }
            n--;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(5);
        LeetCode0061 sol = new LeetCode0061();
        System.out.println(sol.rotateRight(l, 2));
    }
}
