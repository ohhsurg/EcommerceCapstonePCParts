package za.ac.cput.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Order;
import za.ac.cput.domain.OrderItem;

import java.util.ArrayList;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, String> {
    Order findByOrderId(String OrderId);
}


