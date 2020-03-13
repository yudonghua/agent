package cn.yhd.agent;

/**
 * @author yuhuadong
 * @date 2020/3/11
 */
public class Test {
    public static void main(String[] args){
        System.out.println("main start");
        sayHello();
    }
    public static void sayHello()
    {
        try
        {
            Thread.sleep(2000);
            System.out.println("hello");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
