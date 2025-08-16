package org.abc.repository;

import jakarta.enterprise.context.ApplicationScoped;
import org.abc.dto.ExchangeRateDto;
import org.abc.mapper.ExchangeRateMapper;
import org.abc.proxy.ExchangeRateApiProxy;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class DefaultExchangeRateRepository implements ExchangeRateRepository {
    private final ExchangeRateApiProxy exchangeRateApiProxy;

    public DefaultExchangeRateRepository(@RestClient ExchangeRateApiProxy exchangeRateApiProxy) {
        this.exchangeRateApiProxy = exchangeRateApiProxy;
    }

    @Override
    public ExchangeRateDto getExchangeRate() {
        return ExchangeRateMapper.INSTANCE.toDto(exchangeRateApiProxy.getExchangeRate());
    }
}
