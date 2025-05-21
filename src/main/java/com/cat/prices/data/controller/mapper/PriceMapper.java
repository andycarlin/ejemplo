package com.cat.prices.data.controller.mapper;

import com.cat.prices.data.controller.dto.PriceRequest;
import com.cat.prices.data.controller.dto.PriceResponse;
import com.cat.prices.data.domain.Price;
import org.springframework.stereotype.Component;

@Component
public class PriceMapper {

    public Price toEntity(PriceRequest dto) {
        return Price.builder()
                .product(dto.getProduct())
                .value(dto.getValue())
                .currency(dto.getCurrency())
                .build();
    }

    public PriceResponse toResponse(Price entity) {
        return PriceResponse.builder()
                .id(entity.getId())
                .product(entity.getProduct())
                .value(entity.getValue())
                .currency(entity.getCurrency())
                .build();
    }
}
