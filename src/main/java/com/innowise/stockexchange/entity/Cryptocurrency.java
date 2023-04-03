package com.innowise.stockexchange.entity;

import com.innowise.stockexchange.util.EntityConstant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Document(collection = EntityConstant.StockCollection.STOCK_DOCUMENT_COLLECTION_NAME)
@TypeAlias(value = EntityConstant.CryptoCurrencyDocument.CRYPTOCURRENCY_DOCUMENT_NAME)
public class Cryptocurrency extends Stock {

    public Cryptocurrency(String id, String symbol, String name, LocalDateTime created, long marketCap) {
        super(id, symbol, name, created);
        this.marketCap = marketCap;
    }

    long marketCap;

}
