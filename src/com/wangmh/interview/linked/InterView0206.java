package com.wangmh.interview.linked;

import com.wangmh.interview.wmh.ListNode;

/**
* <pre>
*   @author : mh.wang
*   @date   : 2020/5/17 13:27
*   @desc   : InterView0206
* </pre>
 *
 * 面试题 02.06. 回文链表
 * 编写一个函数，检查输入的链表是否是回文的。
 *
 *
 *
 * 示例 1：
 *
 * 输入： 1->2
 * 输出： false
 * 示例 2：
 *
 * 输入： 1->2->2->1
 * 输出： true
 *
 *
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
*/

public class InterView0206 {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode l1 = head;
        ListNode l2 = head;
        ListNode reverseL2 = reverse(l2);
        while(l1 != null){
            if(l1.val != reverseL2.val) return false;
            l1 = l1.next;
            reverseL2 = reverseL2.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode reverseAndClone(ListNode node) {
        ListNode head = null;
        while(node != null) {
            ListNode n = new ListNode(node.val); //复制
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(1);
        l.next.next = new ListNode(2);
        l.next.next.next = new ListNode(1);

        InterView0206 sol = new InterView0206();
        boolean is = sol.isPalindrome(l);
        System.out.println(is);
    }
}
