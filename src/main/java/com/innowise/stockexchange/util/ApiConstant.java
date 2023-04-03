package com.innowise.stockexchange.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ApiConstant {

    @UtilityClass
    public static class ApiRoutes {
        public static final String STOCK_CONTROLLER_ROUTE = "/api/v1/stock";
        public static final String CRYPTOCURRENCY_CONTROLLER_ROUTE = "/api/v1/stock/crypto";
        public static final String STOCK_TOKEN_CONTROLLER_ROUTE = "/api/v1/stock/token";
        public static final String CREATE_STOCK_POST_MAPPING = "create";
        public static final String CREATE_ALL_STOCK_POST_MAPPING = "create/all";
        public static final String GET_ALL_STOCKS_GET_MAPPING = "get/all";
        public static final String GET_STOCK_BY_SYMBOL = "get/{symbol}";
    }

    @UtilityClass
    public static class Service {
        public static final String CRYPTOCURRENCY_SERVICE = "CryptocurrencyService";
        public static final String STOCK_TOKEN_SERVICE = "StockTokenService";
    }
}
