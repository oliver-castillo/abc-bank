package org.abc.resource;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.abc.model.dto.ExchangeRateDto;
import org.abc.model.dto.RequestInfoDto;

@Path("/exchange-rate")
public interface ExchangeRateResource {

    @GET
    @Path("/info")
    ExchangeRateDto getExchangeRate(
            @QueryParam("dni")
            @NotNull(message = "El número de DNI es requerido")
            @Pattern(regexp = "^\\d{8}$", message = "El número de DNI debe contener 8 dígitos numéricos")
            String dni);

    @GET
    @Path("/requests-info")
    RequestInfoDto getRequestInfoByDni(
            @QueryParam("dni")
            @NotNull(message = "El número de DNI es requerido")
            @Pattern(regexp = "^\\d{8}$", message = "El número de DNI debe contener 8 dígitos numéricos")
            String dni);
}
