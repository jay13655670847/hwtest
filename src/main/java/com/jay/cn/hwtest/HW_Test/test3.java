package com.jay.cn.hwtest.HW_Test;/*
 *jay
 *2021/11/2
 */

import java.util.Scanner;

/**
 * * HJ37 统计每个月兔子的总数
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问第n个月的兔子总数为多少？
 */
public class test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            System.out.println(getTotal(scanner.nextInt()));
        }
    }

    public static int getTotal(int month){
        if (month<3){
            return 1;
        }else {
            return getTotal(month-1)+getTotal(month-2);
        }
    }
}
