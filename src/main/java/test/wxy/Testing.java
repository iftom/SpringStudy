package test.wxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.wxy.autoconfig.Person;
import test.wxy.autoconfig.UserService;
import test.wxy.config.JavaConfig;
import test.wxy.normalioc.User;

/**
 * Created By WangXiaoYu Tom
 * 2019/12/18
 * All Rights Reversed
 */
public class Testing {
    @Autowired
    private static UserService userService;

    public static void main2(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User)ctx.getBean("user");
        System.out.println(user);
    }

    public static void main3(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person.getNameAndAge());
    }

    public static void main(String[] args) {


    }
}
