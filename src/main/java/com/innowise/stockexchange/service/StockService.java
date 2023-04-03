package com.innowise.stockexchange.service;

import com.innowise.stockexchange.dto.StockDto;
import com.innowise.stockexchange.entity.Stock;

import java.util.List;

public interface StockService {

    StockDto save(Stock stock);

    List<StockDto> saveAll(List<Stock> stockList);

    StockDto findBySymbol(String symbol);

    List<StockDto> findBySymbolList(List<String> symbolList);

    List<StockDto> findAll();
}
