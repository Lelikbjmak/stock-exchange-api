package com.innowise.stockexchange.repo;

import com.innowise.stockexchange.entity.Stock;
import com.innowise.stockexchange.util.EntityConstant;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CryptoRepository extends StockRepository {

    @Override
    @Query(value = "{'_class': " + EntityConstant.CryptoCurrencyDocument.CRYPTOCURRENCY_DOCUMENT_NAME + "}")
    List<Stock> findAll();

    @Query(value = "{'_class' : " + EntityConstant.CryptoCurrencyDocument.CRYPTOCURRENCY_DOCUMENT_NAME +
            ", 'symbol: ?0'}")
    Stock findBySymbol(String symbol);

    @Query(value = "{'_class': " + EntityConstant.CryptoCurrencyDocument.CRYPTOCURRENCY_DOCUMENT_NAME +
            ", 'symbol': {'$in' : ?0}}")
    List<Stock> findAllBySymbolList(List<String> symbolList);
}
