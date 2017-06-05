package test.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hanchunyang on 2017/6/5.
 */
public class Privoder {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        context.start();
    }
}
