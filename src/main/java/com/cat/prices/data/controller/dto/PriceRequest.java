package com.cat.prices.data.controller.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PriceRequest {
    private String product;
    private Double value;
    private String currency;
}