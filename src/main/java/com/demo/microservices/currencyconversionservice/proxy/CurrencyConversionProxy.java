package com.demo.microservices.currencyconversionservice.proxy;

import com.demo.microservices.currencyconversionservice.entity.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange", url = "localhost:8000" )
@FeignClient(name = "currency-exchange-service")
public interface CurrencyConversionProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversion retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to
    );
}
