package com.innowise.stockexchange.dto;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StockTokenDto extends StockDto {

    public StockTokenDto(String symbol, String name, String manufacturer, String companySector, double dividends) {
        super(symbol, name);
        this.manufacturer = manufacturer;
        this.companySector = companySector;
        this.dividends = dividends;
    }

    private String manufacturer;

    private String companySector;

    private double dividends;
}
