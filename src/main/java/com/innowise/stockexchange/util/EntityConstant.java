package com.innowise.stockexchange.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class EntityConstant {

    @UtilityClass
    public static class StockCollection {
        public static final String STOCK_DOCUMENT_COLLECTION_NAME = "stock";
    }

    @UtilityClass
    public static class AbstractStockDocument {
        public static final String CREATED_AT_FIELD = "created";
        public static final String SYMBOL_FIELD = "symbol";
    }

    @UtilityClass
    public static class CryptoCurrencyDocument {
        public static final String CRYPTOCURRENCY_DOCUMENT_NAME = "Cryptocurrency";
    }

    @UtilityClass
    public static class StockTokenDocument {
        public static final String STOCK_TOKEN_DOCUMENT_NAME = "Tokenized stock";
    }
}
