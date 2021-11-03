package com.jay.cn.hwtest.HW_Test;/*
 *jay
 *2021/11/3
 */

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class test6 {

    public static void main(String[] args) throws ScriptException {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        if (line !=null && line !=""){
            ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
            ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("js");
            System.out.println(scriptEngine.eval(line));
        }
    }
}
