package org.abc.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.abc.exception.TooManyRequestsException;
import org.abc.mapper.ExchangeRateMapper;
import org.abc.model.dto.ExchangeRateDto;
import org.abc.model.dto.RequestInfoDto;
import org.abc.model.entity.ExchangeRateRequestEntity;
import org.abc.repository.ExchangeRateRequestRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

@ApplicationScoped
@RequiredArgsConstructor
public class DefaultExchangeRateService implements ExchangeRateService {
    private final ExchangeRateRequestRepository exchangeRateRequestRepository;
    private static final int MAX_REQUESTS_PER_DAY = 10;

    @Transactional
    @Override
    public ExchangeRateDto getExchangeRate(String dni) {
        validateRequest(dni);
        ExchangeRateDto exchangeRateDto = exchangeRateRequestRepository.getExchangeRate();
        ExchangeRateRequestEntity exchangeRateRequestEntity = buildRequestEntity(dni, exchangeRateDto);
        exchangeRateRequestRepository.persist(exchangeRateRequestEntity);
        return exchangeRateDto;
    }

    @Override
    public RequestInfoDto getRequestInfoByDni(String dni) {
        RequestInfoDto requestInfoDto = new RequestInfoDto();
        requestInfoDto.setDni(dni);
        requestInfoDto.setNumberOfRequests((int) exchangeRateRequestRepository.count("dni", dni));
        return requestInfoDto;
    }

    private ExchangeRateRequestEntity buildRequestEntity(String dni, ExchangeRateDto exchangeRateDto) {
        return ExchangeRateMapper.INSTANCE.toEntity(dni, exchangeRateDto);
    }

    private void validateRequest(String dni) {
        LocalDateTime start = LocalDate.now().atStartOfDay();
        LocalDateTime end = start.plusDays(1);
        long numberOfRequests = exchangeRateRequestRepository.count(
                "dni = :dni AND requestDate BETWEEN :start AND :end",
                Map.of("dni", dni, "start", start, "end", end)
        );
        if (numberOfRequests >= MAX_REQUESTS_PER_DAY) {
            throw new TooManyRequestsException("The maximum number of requests has been exceeded");
        }
    }
}
