package sprung;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloConsumer consumer = context.getBean(HelloConsumer.class);
        System.out.println(consumer.callService());
    }
}
