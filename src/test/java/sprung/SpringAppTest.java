package sprung;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SpringAppTest {
    @Autowired
    private HelloService helloService;

    @Autowired
    private HelloConsumer helloConsumer;

    @Autowired
    private SimpleBeanInterface simpleBean;

    @Test
    public void testSayHello() {
        Assert.assertEquals("Hello world!", helloService.sayHello());
    }

    @Test
    public void testSayHelloThroughConsumer() { Assert.assertEquals("Hello world!", helloConsumer.callService());}

    @Test
    public void testSayHelloThroughClojure() {
        Assert.assertEquals("Hello world!", simpleBean.callSpringBean());
    }
}
