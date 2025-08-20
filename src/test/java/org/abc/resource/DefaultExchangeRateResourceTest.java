package org.abc.resource;

import org.abc.model.dto.ExchangeRateDto;
import org.abc.model.dto.RequestInfoDto;
import org.abc.service.DefaultExchangeRateService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class DefaultExchangeRateResourceTest {
    @InjectMocks
    DefaultExchangeRateResource defaultExchangeRateResourceUnderTest;

    @Mock
    DefaultExchangeRateService defaultExchangeRateService;

    @Test
    void returnExchangeRateWhenDniIsValid() {
        String validDni = "12345678";
        ExchangeRateDto expectedExchangeRate = new ExchangeRateDto();

        Mockito.when(defaultExchangeRateService.getExchangeRate(validDni)).thenReturn(expectedExchangeRate);

        ExchangeRateDto result = defaultExchangeRateResourceUnderTest.getExchangeRate(validDni);

        assertEquals(expectedExchangeRate, result);
        Mockito.verify(defaultExchangeRateService).getExchangeRate(validDni);
    }


    @Test
    void returnRequestInfoWhenDniIsValid() {
        String validDni = "12345678";
        RequestInfoDto expectedRequestInfo = new RequestInfoDto();

        Mockito.when(defaultExchangeRateService.getRequestInfoByDni(validDni)).thenReturn(expectedRequestInfo);

        RequestInfoDto result = defaultExchangeRateResourceUnderTest.getRequestInfoByDni(validDni);

        assertEquals(expectedRequestInfo, result);
        Mockito.verify(defaultExchangeRateService).getRequestInfoByDni(validDni);
    }
}