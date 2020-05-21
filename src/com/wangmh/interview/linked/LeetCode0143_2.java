package com.wangmh.interview.linked;

import com.wangmh.interview.wmh.ListNode;

/**
 * <pre>
 *   @author : mh.wang
 *   @date   : 2020/5/19 13:46
 *   @desc   : LeetCode 0143
 * </pre>
 * <p>
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
public class LeetCode0143_2 {
    /*
     * 1.获取head的中间节点mid，快指针fast走两步与慢指针slow走一步 return slow
     * 2.将链表的后半段进行反转
     * 3.将前后半段的链表进行拼接
     * */

    public void reorderList(ListNode head) {
        if (head == null) return;
        ListNode mid = findMid(head);
        ListNode l2 = mid.next;
        mid.next = null;
        //将后半段的链表进行反转
        l2 = reverse(l2);
        ListNode l1 = head;
        while (l1 != null && l2 != null) {
            ListNode next = l1.next;
            l1.next = l2;
            l2 = l2.next;
            l1.next.next = next;
            l1 = next;
        }
    }

    /**
     * 获取中间节点
     *
     * @param head
     * @return
     */
    private ListNode findMid(ListNode head) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    private ListNode reverseTwo(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
//        ListNode l = new ListNode(1);
//        l.next = new ListNode(1);
//        l.next.next = new ListNode(2);
//        l.next.next.next = new ListNode(1);
//        LeetCode143_2 sol = new LeetCode143_2();

        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(5);
        LeetCode0143_2 sol = new LeetCode0143_2();
        sol.reorderList(l);
        //System.out.println(sol.reverseTwo(l));
    }
}