package org.abc.proxy;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "free-e-api")
@Path("/tipo-cambio")
public interface ExchangeRateApiProxy {
    @GET
    @Path("/today.json")
    ExchangeRateProxy getExchangeRate();
}
