package org.abc.proxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostProxy {
    private Date fecha;
    private Double sunat;
    private Double compra;
    private Double venta;
}
