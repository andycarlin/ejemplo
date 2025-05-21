package com.cat.prices.data.controller.dto;

import com.fasterxml.jackson.core.JsonToken;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PriceResponse {

    private Long id;
    private String product;
    private Double value;
    private String currency;

    public static JsonToken builder() {
    }
}
