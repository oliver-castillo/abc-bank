package org.abc.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.abc.dto.ExchangeRateDto;

@Path("/exchange-rate")
public interface ExchangeRateResource {
    @GET
    ExchangeRateDto getExchangeRate();
}
