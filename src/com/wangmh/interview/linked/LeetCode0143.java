package com.wangmh.interview.linked;

import com.wangmh.interview.wmh.ListNode;

/**
 * <pre>
 *   @author : mh.wang
 *   @date   : 2020/5/16 18:22
 *   @desc   : LeetCode 0143
 * </pre>
 * <p>
 *
 * 143. 重排链表
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 * 示例 1:
 * <p>
 * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 * 示例 2:
 * <p>
 * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 * 通过次数24,255提交次数43,404
 */
public class LeetCode0143 {
    /*
    * 题解:
    * https://www.acwing.com/solution/LeetCode/content/240/
    *
    * 1.获取head的中间节点mid，快指针fast走两步与慢指针slow走一步 return slow
    * 2.将链表的后半段进行反转
    * 3.将前后半段的链表进行拼接
    * */
    public void reorderList(ListNode head) {
        int len = 0;
        for (ListNode p = head; p != null; p = p.next) {
            len++;
        }
        if (len <= 2) {
            return;
        }
        ListNode later = head;
        for (int i = 0; i + 1 < (len + 1) / 2; i++) {
            later = later.next;
        }
        ListNode a = later;
        ListNode b = later.next;

        while (b != null) {
            ListNode c = b.next;
            b.next = a;
            a = b;
            b = c;
        }
        later.next = null;
        while (head != null && head != a) {
            b = a.next;
            a.next = head.next;
            head.next = a;
            head = head.next.next;
            a = b;
        }
    }
}
