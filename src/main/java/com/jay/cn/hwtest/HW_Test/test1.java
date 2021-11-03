package com.jay.cn.hwtest.HW_Test;/*
 *jay
 *2021/11/2
 */

import java.util.Scanner;

/**
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，
 * 她最多可以换多少瓶汽水喝？”答案是 5 瓶，方法如下：先用 9 个空瓶子换3瓶汽水，喝掉 3 瓶满的，喝完以后 4 个空瓶子，用 3 个再换一瓶，
 * 喝掉这瓶满的，这时候剩 2 个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用 3 个空瓶子换一瓶满的还给老板。如果小张手上有 n 个空汽水瓶，最多可以换多少瓶汽水喝？
 */
public class test1 {

    static int res=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int bottle = sc.nextInt();
            if(bottle==0){
                break;
            }
            System.out.println(bottle/2);
        }
    }

    public static int test2(int in){

        if (in%3==0 || (in/3 + in%3)<3){
            return in/3;
        }else if (in%3==1){
            if ((in/3 + in%3)==3){
                return in/3 +1;
            }else{
                res = in/3;
                test2(in/3 +in%3);
            }
        }else {
            if ((in/3 + in%3)==2){
                return in/3+1;
            }else{
                res = in/3;
                test2(in/3 +in%3);
            }
        }

        return res;
    }
}
