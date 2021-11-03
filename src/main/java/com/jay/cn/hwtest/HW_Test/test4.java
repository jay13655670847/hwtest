package com.jay.cn.hwtest.HW_Test;/*
 *jay
 *2021/11/2
 */

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) throws ScriptException {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replace("[","(");
        input = input.replace("{","(");
        input = input.replace("}",")");
        input = input.replace("]",")");
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
        System.out.println(scriptEngine.eval(input));
    }
}
