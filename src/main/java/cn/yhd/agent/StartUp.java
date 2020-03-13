package cn.yhd.agent;

import java.lang.instrument.Instrumentation;

/**
 * @author yuhuadong
 * @date 2020/3/11
 */
public class StartUp {
    public static void premain(String agentArgs, Instrumentation inst) {
//        System.out.println("hello, i'am agent!");
        inst.addTransformer(new MyTransformer());
    }
}
