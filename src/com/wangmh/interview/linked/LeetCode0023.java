package com.wangmh.interview.linked;

import com.wangmh.interview.wmh.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <pre>
 *   @author : mh.wang
 *   @date   : 2020/5/20 18:47
 *   @desc   : LeetCode0023
 * </pre>
 * <p>
 * 23. 合并K个排序链表
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 * 通过次数121,851提交次数236,196
 */
public class LeetCode0023 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        int len = lists.length;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(len, Comparator.comparingInt(o -> o.val));
        for (ListNode list : lists) {
            if (list != null) pq.add(list);
        }
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while (!pq.isEmpty()) {
            ListNode poll = pq.poll();
            head.next = poll;
            head = head.next;
            if (poll.next!=null){
                pq.add(poll.next);
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l2.next = new ListNode(6);

        ListNode[] ls = new ListNode[]{l1, l2, l3};
        LeetCode0023 sol = new LeetCode0023();
        System.out.println(sol.mergeKLists(ls));
    }
}
