package com.jay.cn.hwtest.HW_Test;/*
 *jay
 *2021/11/3
 */

import java.util.Scanner;

/**
 * HJ108 求最小公倍数
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 */
public class test11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i =Math.min(a, b); i >0 ; i--) {
            if (a%i==0 && b%i==0){
                System.out.println(a*b/i);
                break;
            }
        }

    }
}
