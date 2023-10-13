package hello.core.selfTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SelfTest {

    ApplicationContext ac = new AnnotationConfigApplicationContext(TestAppConfig.class);

    @Test
    public void test() {
        Hello bean = ac.getBean("hello", Hello.class);
        System.out.println("bean = " + bean.getClass());
    }

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = ac.getBean(beanDefinitionName);
            System.out.println("name = " + beanDefinitionName + " object =" + bean);
        }
    }

    @Configuration
    static class TestAppConfig {

        @Bean
        public Hello hello() {
            return new Hello();
        }

        @Bean
        public Hi hi() {
            return new Hi(hello());
        }
    }

}

