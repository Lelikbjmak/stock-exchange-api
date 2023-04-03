package com.innowise.stockexchange.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CryptocurrencyDto extends StockDto {

    public CryptocurrencyDto(String symbol, String name, long marketCap) {
        super(symbol, name);
        this.marketCap = marketCap;
    }

    private long marketCap;
}
