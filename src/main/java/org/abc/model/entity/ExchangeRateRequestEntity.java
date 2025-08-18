package org.abc.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "requests")
public class ExchangeRateRequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "dni")
    private String dni;

    @Column(name = "request_date")
    private LocalDateTime requestDate;

    @Column(name = "exchange_rate_date")
    private LocalDate exchangeRateDate;

    @Column(name = "sunat_exchange_rate")
    private Double sunatExchangeRate;

    @Column(name = "buying_exchange_rate")
    private Double buyingExchangeRate;

    @Column(name = "selling_exchange_rate")
    private Double sellingExchangeRate;
}
