package org.abc.mapper;

import org.abc.model.dto.ExchangeRateDto;
import org.abc.model.entity.ExchangeRateRequestEntity;
import org.abc.proxy.ExchangeRateProxy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExchangeRateMapper {
    ExchangeRateMapper INSTANCE = Mappers.getMapper(ExchangeRateMapper.class);

    ExchangeRateDto toDto(ExchangeRateProxy proxy);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "exchangeRateDate", source = "dto.date")
    @Mapping(target = "requestDate", expression = "java(java.time.LocalDateTime.now())")
    ExchangeRateRequestEntity toEntity(String dni, ExchangeRateDto dto);
}
