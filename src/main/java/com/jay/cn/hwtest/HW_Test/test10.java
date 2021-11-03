package com.jay.cn.hwtest.HW_Test;/*
 *jay
 *2021/11/3
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * HJ74 参数解析
 */
public class test10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        if (nextLine!=null && nextLine!=""){
            if (nextLine.contains("\"")){
                String[] arrs = nextLine.split("\"");
                ArrayList<String> list = new ArrayList<>();
                for (int i=0;i<arrs.length;i++){
                    if (arrs[i]!=" "){
                        String[] strs = arrs[i].trim().split(" ");
//                        Arrays.stream(strs).forEach(x -> {
//                            x.replace("\"","");
//                            list.add(x);
//                        });

                        for (int j=0; j<strs.length;j++){
                            strs[j].replace("\"","");
                            list.add(strs[j]);
                        }
                    }
                }

                System.out.println(list.size());
                list.stream().forEach(x -> System.out.println(x));
            }else {
                String[] arrs = nextLine.split(" ");
                System.out.println(arrs.length);
                Arrays.stream(arrs).forEach(x -> System.out.println(x));
            }
        }
    }
}
