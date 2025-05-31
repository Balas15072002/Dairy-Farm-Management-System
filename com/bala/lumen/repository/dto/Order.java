package com.bala.lumen.repository.dto;

import java.time.LocalDate;

public class Order {
    private String orderId;
    private String customerId;
    private String milkType; // Cow, Buffalo, Goat
    private double quantityInLiters;
    private double pricePerLiter;
    private double totalAmount;
    private LocalDate orderDate;
    private boolean isDelivered;
}
