package com.wangmh.interview.base;

/**
* <pre>
*   @author : mh.wang
*   @date   : 2020/5/20 18:09
*   @desc   :
 *   29. 两数相除
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
 *
 *
 *
 * 示例 1:
 *
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 解释: 10/3 = truncate(3.33333..) = truncate(3) = 3
 * 示例 2:
 *
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * 解释: 7/-3 = truncate(-2.33333..) = -2
 *
 *
 * 提示：
 *
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为 0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。
 * 通过次数46,721提交次数237,631
* </pre>
*/
public class LeetCode0029 {
    //超出时间限制
    public int divide(int dividend, int divisor) {
        if (divisor == 0) return 0;
        if (dividend == 0) return 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int flag = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            flag = -flag;
        }
        if (dividend < 0) dividend = -dividend;
        if (divisor < 0) divisor = -divisor;

        if (dividend < divisor) return 0;

        int res = 0;
        while (dividend > 0) {
            dividend -= divisor;
            if (dividend > 0 & dividend < divisor) continue;
            res++;
        }
        int a = 10;
        int b = 3;
        int c = Math.floorDiv(a,b);
        return c;
        //return flag > 0 ? res : -res;
    }

    public static void main(String[] args) {
        LeetCode0029 sol = new LeetCode0029();
        System.out.println(sol.divide(Integer.MAX_VALUE, 2));
    }
}
