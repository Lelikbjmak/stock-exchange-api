package com.innowise.stockexchange.serviceimpl;

import com.innowise.stockexchange.dto.StockDto;
import com.innowise.stockexchange.entity.Stock;
import com.innowise.stockexchange.mapper.StockListMapper;
import com.innowise.stockexchange.mapper.StockMapper;
import com.innowise.stockexchange.repo.StockRepository;
import com.innowise.stockexchange.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Primary
@Transactional
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

    private final StockRepository stockRepository;

    private final StockMapper stockMapper;

    private final StockListMapper stockListMapper;

    @Override
    public StockDto save(Stock stock) {
        Stock savedStock = stockRepository.save(stock);
        return stockMapper.mapToDto(savedStock);
    }

    @Override
    public List<StockDto> saveAll(List<Stock> stockList) {
        List<Stock> savedStockList = stockRepository.saveAll(stockList);
        return stockListMapper.mapToDtoList(savedStockList);
    }

    @Override
    public StockDto findBySymbol(String symbol) {
        Stock foundBySymbolStock = stockRepository.findBySymbol(symbol);
        return stockMapper.mapToDto(foundBySymbolStock);
    }

    @Override
    public List<StockDto> findBySymbolList(List<String> symbolList) {
        List<Stock> stockList = stockRepository.findBySymbolIn(symbolList);
        return stockListMapper.mapToDtoList(stockList);
    }

    @Override
    public List<StockDto> findAll() {
        List<Stock> foundStockList = stockRepository.findAll();
        return stockListMapper.mapToDtoList(foundStockList);
    }
}
