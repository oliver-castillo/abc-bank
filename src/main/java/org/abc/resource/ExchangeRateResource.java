package org.abc.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.abc.model.dto.ExchangeRateDto;
import org.abc.model.dto.RequestDto;

@Path("/exchange-rate")
public interface ExchangeRateResource {
    @GET
    @Path("/info")
    ExchangeRateDto getExchangeRate(@QueryParam("dni") String dni);

    @GET
    @Path("/requests-info")
    RequestDto getRequestInfoByDni(@QueryParam("dni") String dni);
}
