package org.abc.service;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import org.abc.dto.ExchangeRateDto;
import org.abc.repository.ExchangeRateRepository;

@ApplicationScoped
@RequiredArgsConstructor
public class DefaultExchangeRateService implements ExchangeRateService {
    private final ExchangeRateRepository exchangeRateRepository;

    @Override
    public ExchangeRateDto getExchangeRate(String dni) {
        return exchangeRateRepository.getExchangeRate();
    }
}
