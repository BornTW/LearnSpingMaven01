package learn.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
    public static void main(String [] args){
        //1. 初始化 spring 容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2. 通过容器获取 userDao 实例
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        //3. 调用实例中的方法
        userDao.say();
    }
}
