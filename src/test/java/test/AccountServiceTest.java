package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.config.SpringConfig;
import test.wxy.normalioc.User;

/**
 * Created By WangXiaoYu Tom
 * 2019/12/22
 * All Rights Reversed
 *  Spring整合Junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private User user;
    @Test
    public void testSaveAccount() {
        System.out.println(user);
    }
}
