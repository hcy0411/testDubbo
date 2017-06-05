package test.dubbo.customer;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.dubbo.api.FileOperate;

public class Customer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        applicationContext.start();

        try {
            FileOperate fileOperate = (FileOperate) applicationContext.getBean("operateServer");
            fileOperate.write("test.txt", "haha\r\n");
            String context = fileOperate.readOneLine("test.txt",3);
            System.out.print(context);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
