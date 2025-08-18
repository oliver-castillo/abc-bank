package org.abc.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.abc.model.dto.ExchangeRateDto;
import org.abc.model.entity.ExchangeRateRequestEntity;


public interface ExchangeRateRequestRepository extends PanacheRepository<ExchangeRateRequestEntity> {
    ExchangeRateDto getExchangeRate();
}
