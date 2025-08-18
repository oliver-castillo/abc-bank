package org.abc.resource;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import org.abc.model.dto.ExchangeRateDto;
import org.abc.model.dto.RequestDto;
import org.abc.service.ExchangeRateService;

@RequiredArgsConstructor
@ApplicationScoped
public class DefaultExchangeRateResource implements ExchangeRateResource {
    private final ExchangeRateService exchangeRateService;

    @Override
    public ExchangeRateDto getExchangeRate(String dni) {
        return exchangeRateService.getExchangeRate(dni);
    }

    @Override
    public RequestDto getRequestInfoByDni(String dni) {
        return exchangeRateService.getRequestInfoByDni(dni);
    }
}
