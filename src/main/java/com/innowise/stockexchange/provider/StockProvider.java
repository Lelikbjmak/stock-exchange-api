package com.innowise.stockexchange.provider;

import com.innowise.stockexchange.dto.StockDto;
import com.innowise.stockexchange.entity.Stock;

import java.util.List;

public interface StockProvider {
    Stock generateStock(StockDto stockDto);

    List<Stock> generateStockList(List<StockDto> stockDtoList);
}
