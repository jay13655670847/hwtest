package com.jay.cn.hwtest.HW_Test;/*
 *jay
 *2021/11/3
 */

import java.util.Scanner;

/**
 * HJ56 完全数计算
 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 *
 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
 *
 * 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
 *
 * 输入n，请输出n以内(含n)完全数的个数。
 */
public class test7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int in = scanner.nextInt();
            if (in <6){
                System.out.println(0);
            }else{
                int count=0;
                for (int i = 6; i <=in; i++) {
                    int sum=0;
                    for (int j = 1; j <= i / 2; j++) {
                        if (i%j==0){
                            sum +=j;
                        }
                    }
                    if (sum==i)
                        count++;
                }

                System.out.println(count);
            }
        }

    }
}
