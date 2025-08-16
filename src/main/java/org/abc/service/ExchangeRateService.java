package org.abc.service;

import org.abc.dto.ExchangeRateDto;

public interface ExchangeRateService {

    ExchangeRateDto getExchangeRate(String dni);
}
