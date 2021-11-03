package com.jay.cn.hwtest.HW_Test;/*
 *jay
 *2021/11/3
 */

import java.util.Calendar;
import java.util.Scanner;

/**HJ73 计算日期到天数转换
 * 根据输入的日期，计算是这一年的第几天。
 * 保证年份为4位数且日期合法。
 * 进阶：时间复杂度：，空间复杂度：
 * 输入描述：
 * 输入一行，每行空格分割，分别是年，月，日
 *
 * 输出描述：
 * 输出是这一年的第几天
 */
public class test9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int year = Integer.parseInt(inputs[0]);
        int month = Integer.parseInt(inputs[1]);
        int day = Integer.parseInt(inputs[2]);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);
        int i = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(i);

    }
}
