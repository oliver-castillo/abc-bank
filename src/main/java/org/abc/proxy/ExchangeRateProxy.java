package org.abc.proxy;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExchangeRateProxy {
    @JsonProperty("fecha")
    private LocalDate date;
    @JsonProperty("sunat")
    private Double sunatExchangeRate;
    @JsonProperty("compra")
    private Double buyingExchangeRate;
    @JsonProperty("venta")
    private Double sellingExchangeRate;
}
