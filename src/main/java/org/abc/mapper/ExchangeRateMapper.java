package org.abc.mapper;

import org.abc.dto.ExchangeRateDto;
import org.abc.proxy.ExchangeRateProxy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExchangeRateMapper {
    ExchangeRateMapper INSTANCE = Mappers.getMapper(ExchangeRateMapper.class);

    ExchangeRateDto toDto(ExchangeRateProxy entity);
}
