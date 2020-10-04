package hello;

import lombok.Setter;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderService {

    public static int counter = 0;

    @Cacheable("orders")
    public Order findById(Long id) {
        counter++;
        return new Order(id, "desc_" + id);
    }

    @Cacheable("stocks")
    public Map<String, Entry> getEntries() {
        counter++;
        final Map<String, Entry> map = new HashMap<>();
        map.put("key", new Entry(123l, "interesting entry"));
        return map;
    }
}
