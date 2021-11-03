package com.jay.cn.hwtest.HW_Test;

import java.util.Scanner;

/**HJ31 单词倒排
 * 对字符串中的所有单词进行倒排。
 *
 * 说明：
 *
 * 1、构成单词的字符只有26个大写或小写英文字母；
 *
 * 2、非构成单词的字符均视为单词间隔符；
 *
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 *
 * 4、每个单词最长20个字母；
 */
public class test2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String[] words = str.split("[^A-Za-z]");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i=words.length-1;i>=0;i--){
                stringBuilder.append(words[i]).append(" ");
            }
            System.out.println(stringBuilder.toString().trim());
        }

    }

}
