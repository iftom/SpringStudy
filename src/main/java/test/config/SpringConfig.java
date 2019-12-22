package test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.wxy.normalioc.User;

/**
 * Created By WangXiaoYu Tom
 * 2019/12/22
 * All Rights Reversed
 */
@Configuration
public class SpringConfig {

    @Bean
    public User getUser(){
        return new User();
    }

}
