package com.jay.cn.hwtest.HW_Test;/*
 *jay
 *2021/11/3
 */

import java.util.Scanner;

/**
 * HJ72 百钱买百鸡问题
 *
 * 公元前五世纪，我国古代数学家张丘建在《算经》一书中提出了“百鸡问题”：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 * 现要求你打印出所有花一百元买一百只鸡的方式。
 */
public class test8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();

        for (int i = 0; i <=100; i++) {
                for (int j = 0; j <=100-i; j++) {
                    int ii = i*5;
                    int jj = j*3;
                    int k=100-i-j;
                    if ((i+j+k ==100) && (ii+jj+k/3)==100 && (k%3==0)){
                        System.out.printf(i+" ");
                        System.out.printf(j+" ");
                        System.out.printf((100-i-j)+" ");
                        System.out.println();
                        continue;
                    }
                }
        }


    }
}
