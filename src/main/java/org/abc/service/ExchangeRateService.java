package org.abc.service;

import org.abc.model.dto.ExchangeRateDto;
import org.abc.model.dto.RequestDto;

public interface ExchangeRateService {

    ExchangeRateDto getExchangeRate(String dni);

    RequestDto getRequestInfoByDni(String dni);
}
