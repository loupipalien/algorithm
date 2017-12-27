package com.ltchen.algorithm;

/**
 * @author : ltchen
 * @date : 2017/12/28
 * @desc : 对任意非负整数, 统计其二进制展开中数位1的总数
 */
public class CountOnes {

    public static int countOnes(int n) {
        int ones = 0;
        while (0 < n) {
            // n 和 1 做与运算, 检查最低位
            ones += (n & 1);
            // 右移一位
            n >>= 1;
        }
        return ones;
    }

    public static int countOnes1(int n) {
        int ones = 0;
        while (0 < n) {
            // 至少有一位 1
            ones++;
            // 清除 n 的最右位的 1
            n &= n - 1;
        }
        return ones;
    }

    public static int countOnes2(int n) {
        return 0;
    }

    public static void main(String[] args) {
//        System.out.println(5 << 0);
//        System.out.println(5 >> 0);
//        System.out.println(Integer.toBinaryString(-1));
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
//        System.out.println(CountOnes.countOnes(Integer.MAX_VALUE));
//        System.out.println(Integer.bitCount(Integer.MAX_VALUE));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(CountOnes.countOnes(Integer.MIN_VALUE));
        System.out.println(Integer.bitCount(Integer.MIN_VALUE));
        System.out.println();
        System.out.println(Integer.MIN_VALUE >> 2);
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE >> 2));
        System.out.println(CountOnes.countOnes(Integer.MIN_VALUE >> 2));
        System.out.println(Integer.bitCount(Integer.MIN_VALUE >> 2));
        System.out.println();
        System.out.println(Integer.MIN_VALUE >>> 2);
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE >>> 2));
        System.out.println(CountOnes.countOnes(Integer.MIN_VALUE >>> 2));
        System.out.println(Integer.bitCount(Integer.MIN_VALUE >>> 2));

//        System.out.println(pow(pow(0)) + 1);
//        System.out.println(Integer.toBinaryString(pow(pow(0)) + 1));
//        System.out.println(pow(pow(1)) + 1);
//        System.out.println(Integer.toBinaryString(pow(pow(1)) + 1));
//        System.out.println(pow(pow(2)) + 1);
//        System.out.println(Integer.toBinaryString(pow(pow(2)) + 1));
//        System.out.println(pow(pow(3)) + 1);
//        System.out.println(Integer.toBinaryString(pow(pow(3)) + 1));
//        System.out.println(pow(pow(4)) + 1);
//        System.out.println(Integer.toBinaryString(pow(pow(4)) + 1));
    }

    public static int pow(int i) {
        return 1 << i;
    }
}
