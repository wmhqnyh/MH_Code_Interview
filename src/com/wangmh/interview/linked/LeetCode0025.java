//package com.wangmh.interview.linked;
//
//import com.wangmh.interview.wmh.ListNode;
//
///**
// * <pre>
// *   @author : mh.wang
// *   @date   : 2020/5/20 19:04
// *   @desc   : LeetCode 0025
// * </pre>
// * <p>
// * 25. K 个一组翻转链表
// * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
// * <p>
// * k 是一个正整数，它的值小于或等于链表的长度。
// * <p>
// * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
// * <p>
// * <p>
// * <p>
// * 示例：
// * <p>
// * 给你这个链表：1->2->3->4->5
// * <p>
// * 当 k = 2 时，应当返回: 2->1->4->3->5
// * <p>
// * 当 k = 3 时，应当返回: 3->2->1->4->5
// * <p>
// * <p>
// * <p>
// * 说明：
// * <p>
// * 你的算法只能使用常数的额外空间。
// * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
// * 通过次数69,254提交次数113,596
// */
//public class LeetCode0025 {
//    public ListNode reverseKGroup(ListNode head, int k) {
//        if (head == null) return null;
//        int n = 0;
//        for (ListNode p = head; p != null; p = p.next) n++;
//        if (k >= n) return head;
//        return null;
//    }
//}
