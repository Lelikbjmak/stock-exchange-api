package com.innowise.stockexchange.serviceimpl;

import com.innowise.stockexchange.dto.StockDto;
import com.innowise.stockexchange.entity.Stock;
import com.innowise.stockexchange.mapper.StockListMapper;
import com.innowise.stockexchange.mapper.StockMapper;
import com.innowise.stockexchange.repo.CryptoRepository;
import com.innowise.stockexchange.service.StockService;
import com.innowise.stockexchange.util.ApiConstant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@RequiredArgsConstructor
@Service(value = ApiConstant.Service.CRYPTOCURRENCY_SERVICE)
public class CryptocurrencyServiceImpl implements StockService {

    private final CryptoRepository cryptoRepository;

    private final StockMapper stockMapper;

    private final StockListMapper stockListMapper;

    @Override
    public StockDto save(Stock stock) {
        Stock savedCrypto = cryptoRepository.save(stock);
        return stockMapper.mapToDto(savedCrypto);
    }

    @Override
    public List<StockDto> saveAll(List<Stock> stockList) {
        List<Stock> savedStockList = cryptoRepository.saveAll(stockList);
        return stockListMapper.mapToDtoList(savedStockList);
    }

    @Override
    public StockDto findBySymbol(String symbol) {
        Stock foundCryptocurrency = cryptoRepository.findBySymbol(symbol);
        return stockMapper.mapToDto(foundCryptocurrency);
    }

    @Override
    public List<StockDto> findBySymbolList(List<String> symbolList) {
        List<Stock> foundCryptoBySymbolList = cryptoRepository.findAllBySymbolList(symbolList);
        return stockListMapper.mapToDtoList(foundCryptoBySymbolList);
    }

    @Override
    public List<StockDto> findAll() {
        List<Stock> foundCryptocurrencies = cryptoRepository.findAll();
        return stockListMapper.mapToDtoList(foundCryptocurrencies);
    }
}
