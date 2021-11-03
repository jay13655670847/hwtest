package com.jay.cn.hwtest.HW_Test;/*
 *jay
 *2021/11/3
 */

import java.util.Scanner;

/**
 * HJ100 等差数列
 * 等差数列 2，5，8，11，14。。。。
 * （从 2 开始的 3 为公差的等差数列）
 * 输出求等差数列前N项和
 *
 * 本题有多组输入
 */
public class test12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       while (scanner.hasNext()){
           int n = scanner.nextInt();
           int sum=0;
           for (int i=0;i<n;i++){
               sum += 3*i+2;
           }
           System.out.println(sum);
       }
    }
}
