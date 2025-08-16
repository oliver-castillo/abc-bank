package org.abc.resource;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import org.abc.dto.ExchangeRateDto;
import org.abc.service.ExchangeRateService;

@RequiredArgsConstructor
@ApplicationScoped
public class DefaultExchangeRateResource implements ExchangeRateResource {
    private final ExchangeRateService exchangeRateService;

    @Override
    public ExchangeRateDto getExchangeRate() {
        return exchangeRateService.getExchangeRate();
    }
}
