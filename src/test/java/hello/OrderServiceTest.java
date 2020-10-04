package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void order() throws Exception {
        OrderService.counter = 0;
        orderService.findById(1l);
        assertEquals(1, OrderService.counter);
        orderService.findById(1l);
        assertEquals(1, OrderService.counter);
        orderService.findById(2l);
        assertEquals(2, OrderService.counter);
    }

    @Test
    public void entry() throws Exception {
        OrderService.counter = 0;
        orderService.getEntries();
        assertEquals(1, OrderService.counter);
		orderService.getEntries();
        assertEquals(1, OrderService.counter);
    }
}
