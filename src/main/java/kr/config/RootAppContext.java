package kr.config;

import kr.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

//root-context.xml
@Configuration
public class RootAppContext {

//    @Bean("loginBean")
//    @SessionScope
//    public User loginBean(){
//        return new User();
//    }
}
