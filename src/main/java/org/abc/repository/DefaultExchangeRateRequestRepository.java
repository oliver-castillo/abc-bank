package org.abc.repository;

import jakarta.enterprise.context.ApplicationScoped;
import org.abc.mapper.ExchangeRateMapper;
import org.abc.model.dto.ExchangeRateDto;
import org.abc.proxy.ExchangeRateApiProxy;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class DefaultExchangeRateRequestRepository implements ExchangeRateRequestRepository {
    private final ExchangeRateApiProxy exchangeRateApiProxy;

    public DefaultExchangeRateRequestRepository(@RestClient ExchangeRateApiProxy exchangeRateApiProxy) {
        this.exchangeRateApiProxy = exchangeRateApiProxy;
    }

    @Override
    public ExchangeRateDto getExchangeRate() {
        return ExchangeRateMapper.INSTANCE.toDto(exchangeRateApiProxy.getExchangeRate());
    }
}
