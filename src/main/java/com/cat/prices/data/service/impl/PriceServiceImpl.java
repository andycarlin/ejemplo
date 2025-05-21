package com.cat.prices.data.service.impl;

import com.cat.prices.data.controller.dto.PriceRequest;
import com.cat.prices.data.controller.dto.PriceResponse;
import com.cat.prices.data.controller.mapper.PriceMapper;
import com.cat.prices.data.domain.Price;
import com.cat.prices.data.repository.PriceRepository;
import com.cat.prices.data.service.IPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PriceServiceImpl implements IPriceService {

    private final PriceRepository repository;
    private final PriceMapper mapper;

    @Override
    public PriceResponse createPrice(PriceRequest request) {
        Price price = mapper.toEntity(request);
        Price saved = repository.save(price);
        return mapper.toResponse(saved);
    }

    @Override
    public List<Price> listAllPrices() {
        return List.of();
    }


}
