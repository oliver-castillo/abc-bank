package org.abc.service;

import org.abc.model.dto.ExchangeRateDto;
import org.abc.model.dto.RequestInfoDto;

public interface ExchangeRateService {

    ExchangeRateDto getExchangeRate(String dni);

    RequestInfoDto getRequestInfoByDni(String dni);
}
