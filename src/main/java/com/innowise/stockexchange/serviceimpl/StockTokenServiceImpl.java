package com.innowise.stockexchange.serviceimpl;

import com.innowise.stockexchange.dto.StockDto;
import com.innowise.stockexchange.entity.Stock;
import com.innowise.stockexchange.mapper.StockListMapper;
import com.innowise.stockexchange.mapper.StockMapper;
import com.innowise.stockexchange.repo.StockTokenRepository;
import com.innowise.stockexchange.service.StockService;
import com.innowise.stockexchange.util.ApiConstant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service(value = ApiConstant.Service.STOCK_TOKEN_SERVICE)
public class StockTokenServiceImpl implements StockService {

    private final StockTokenRepository stockTokenRepository;

    private final StockMapper stockMapper;

    private final StockListMapper stockListMapper;

    @Override
    public StockDto save(Stock stock) {
        Stock savedToken = stockTokenRepository.save(stock);
        return stockMapper.mapToDto(stock);
    }

    @Override
    public List<StockDto> saveAll(List<Stock> stockList) {
        return null;
    }

    @Override
    public StockDto findBySymbol(String symbol) {
        return null;
    }

    @Override
    public List<StockDto> findBySymbolList(List<String> symbolList) {
        return null;
    }

    @Override
    public List<StockDto> findAll() {
        return null;
    }
}
