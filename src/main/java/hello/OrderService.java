package hello;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	public static int counter=0;

	@Cacheable("orders")
	public Order findById(Long id) {
		counter++;
		return new Order(id, "desc_" + id);
	}
}
