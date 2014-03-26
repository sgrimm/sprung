package sprung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by koreth on 3/26/14.
 */
@Component
public class HelloConsumer {
    @Autowired
    private HelloService hs;

    public String callService() {
        return hs.sayHello();
    }
}
