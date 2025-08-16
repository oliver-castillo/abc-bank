package org.abc.proxy;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "free-e-api")
@Path("/tipo-cambio/today.json")
public interface ApiProxy {
    @GET
    PostProxy getExchangeRate();
}
