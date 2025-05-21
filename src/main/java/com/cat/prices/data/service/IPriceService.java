package com.cat.prices.data.service;

import com.cat.prices.data.controller.dto.PriceRequest;
import com.cat.prices.data.controller.dto.PriceResponse;
import com.cat.prices.data.domain.Price;

import java.util.List;

public interface IPriceService {

    PriceResponse createPrice(PriceRequest request);
    List<Price> listAllPrices();

}
