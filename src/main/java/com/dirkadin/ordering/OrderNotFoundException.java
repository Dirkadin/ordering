package com.dirkadin.ordering;

public class OrderNotFoundException extends RuntimeException {
    OrderNotFoundException(Long id) {
        super("Order not found: " + id);
    }
}
