package com.innowise.stockexchange.repo;

import com.innowise.stockexchange.entity.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StockRepository extends MongoRepository<Stock, String> {

    Stock findBySymbol(String symbol);

    List<Stock> findBySymbolIn(List<String> symbolList);

}
