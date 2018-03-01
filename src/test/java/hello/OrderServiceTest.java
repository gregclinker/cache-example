package hello;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {

	@Autowired
	private OrderService orderService;

	@Test
	public void getHello() throws Exception {
		orderService.findById(1l);
		assertEquals(1, OrderService.counter);
		orderService.findById(1l);
		assertEquals(1, OrderService.counter);
		orderService.findById(2l);
		assertEquals(2, OrderService.counter);
	}
}
