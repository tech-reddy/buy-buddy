package com.buybuddy.dto;

import java.math.BigDecimal;

public class CartItemDto {
    private Long itemId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private ProductDto product;
}
