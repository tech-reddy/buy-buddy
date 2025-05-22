package com.buybuddy.service.order;

import com.buybuddy.dto.OrderDto;
import com.buybuddy.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
