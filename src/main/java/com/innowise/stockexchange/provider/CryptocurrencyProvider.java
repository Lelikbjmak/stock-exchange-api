package com.innowise.stockexchange.provider;

import com.innowise.stockexchange.dto.StockDto;
import com.innowise.stockexchange.entity.Stock;
import com.innowise.stockexchange.mapper.StockListMapper;
import com.innowise.stockexchange.mapper.StockMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CryptocurrencyProvider implements StockProvider {

    private final StockMapper stockMapper;

    private final StockListMapper stockListMapper;

    @Override
    public Stock generateStock(StockDto stockDto) {
        return stockMapper.mapToEntity(stockDto);
    }

    @Override
    public List<Stock> generateStockList(List<StockDto> stockDtoList) {
        return stockListMapper.mapToEntityList(stockDtoList);
    }

}
