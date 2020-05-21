package com.wangmh.interview.linked;

import com.wangmh.interview.wmh.ListNode;

/**
 * <pre>
 *   @author : mh.wang
 *   @date   : 2020/5/19 22:52
 *   @desc   : LeetCode 0083
 * </pre>
 * <p>
 * 83. 删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 * 通过次数100,063提交次数198,878
 */
public class LeetCode0083 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) cur.next = cur.next.next;
            else cur = cur.next;
        }
        return head;
    }
}
