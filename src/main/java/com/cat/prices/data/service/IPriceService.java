package com.cat.prices.data.service;

import com.cat.prices.data.controller.dto.PriceRequest;
import com.cat.prices.data.controller.dto.PriceResponse;

public interface IPriceService {

    PriceResponse createPrice(PriceRequest request);
}
