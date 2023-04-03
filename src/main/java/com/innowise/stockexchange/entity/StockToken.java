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
@TypeAlias(value = EntityConstant.StockTokenDocument.STOCK_TOKEN_DOCUMENT_NAME)
@Document(collection = EntityConstant.StockCollection.STOCK_DOCUMENT_COLLECTION_NAME)
public class StockToken extends Stock {

    public StockToken(String id, String symbol, String name, LocalDateTime created, String manufacturer, String companySector, double dividends) {
        super(id, symbol, name, created);
        this.manufacturer = manufacturer;
        this.companySector = companySector;
        this.dividends = dividends;
    }

    private String manufacturer;

    private String companySector;

    private double dividends;
}
