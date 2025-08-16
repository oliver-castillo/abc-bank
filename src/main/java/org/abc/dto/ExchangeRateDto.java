package org.abc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExchangeRateDto {
    private Date fecha;
    private Double sunat;
    private Double compra;
    private Double venta;
}
