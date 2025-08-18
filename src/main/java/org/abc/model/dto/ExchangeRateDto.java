package org.abc.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ExchangeRateDto {
    @JsonProperty("fecha")
    private LocalDate date;
    @JsonProperty("sunat")
    private Double sunatExchangeRate;
    @JsonProperty("compra")
    private Double buyingExchangeRate;
    @JsonProperty("venta")
    private Double sellingExchangeRate;
}
