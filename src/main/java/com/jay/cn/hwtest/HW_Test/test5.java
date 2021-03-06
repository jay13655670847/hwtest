package com.jay.cn.hwtest.HW_Test;/*
 *jay
 *2021/11/2
 */

import java.util.Scanner;

/**
 * HJ53 杨辉三角的变形
 * 以上三角形的数阵，第一行只有一个数1，以下每行的每个数，是恰好是它上面的数，左上角数到右上角的数，3个数之和（如果不存在某个数，认为该数就是0）。
 *
 * 求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3。
 */
public class test5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int input = scanner.nextInt();
            if (input<3){
                System.out.println(-1);
            }else{
                if (input%4 ==3 || input%4 ==1){
                    System.out.println(2);
                }else if (input%4 ==0){
                    System.out.println(3);
                }else if (input%4 ==2){
                    System.out.println(4);
                }
            }
        }
    }
}
