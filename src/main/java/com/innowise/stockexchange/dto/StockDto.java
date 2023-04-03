package com.innowise.stockexchange.dto;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public abstract class StockDto {
    private String symbol;
    private String name;
}
