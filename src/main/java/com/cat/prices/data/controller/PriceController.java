package com.cat.prices.data.controller;
import com.cat.prices.data.controller.dto.PriceRequest;
import com.cat.prices.data.controller.dto.PriceResponse;
import com.cat.prices.data.service.IPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prices")
@RequiredArgsConstructor
public class PriceController {

    private final IPriceService service;

    @PostMapping
    public ResponseEntity<PriceResponse> createPrice(@RequestBody PriceRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createPrice(request));
    }
}
}
