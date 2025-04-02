package com.thedevhorse.modularizearchitecture;

import com.thedevhorse.modularizearchitecture.order.domain.Order;
import com.thedevhorse.modularizearchitecture.order.service.OrderService;
import com.thedevhorse.modularizearchitecture.order.spi.OrderFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.math.BigDecimal;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@SpringBootTest
class OrderServiceTest {

    @MockitoBean
    private OrderFacade orderFacade;

    @Autowired
    private OrderService orderService;

    @Test
    void givenValidOrder_whenProcessingOrder_thenShouldReturnSuccessMessage() {
        // Given
        Order order = Order.create("order-999", "prod-001", 1234567898765L);
        BigDecimal price = new BigDecimal("49.99");
        String expected = format("Order completed successfully for order id : %s", order.id());

        when(orderFacade.getPriceByProductId(order.productId())).thenReturn(price);
        doNothing().when(orderFacade).executePayment(price, order.cardNumber());

        // When
        String actual = orderService.processOrder(order);

        // Then
        assertEquals(expected, actual);
    }
}
