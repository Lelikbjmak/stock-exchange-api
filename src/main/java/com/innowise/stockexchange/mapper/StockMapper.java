package com.innowise.stockexchange.mapper;

import com.innowise.stockexchange.dto.CryptocurrencyDto;
import com.innowise.stockexchange.dto.StockDto;
import com.innowise.stockexchange.dto.StockTokenDto;
import com.innowise.stockexchange.entity.Cryptocurrency;
import com.innowise.stockexchange.entity.Stock;
import com.innowise.stockexchange.entity.StockToken;
import com.innowise.stockexchange.util.EntityConstant;
import com.innowise.stockexchange.util.MapStructConstant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StockMapper {

    @Mapping(target = EntityConstant.AbstractStockDocument.CREATED_AT_FIELD,
            expression = MapStructConstant.EXPRESSION_TO_GENERATE_STOCK_CREATED_AT_FIELD)
    Cryptocurrency mapToCryptocurrencyEntity(CryptocurrencyDto cryptocurrencyDto);

    @Mapping(target = EntityConstant.AbstractStockDocument.CREATED_AT_FIELD,
            expression = MapStructConstant.EXPRESSION_TO_GENERATE_STOCK_CREATED_AT_FIELD)
    StockToken mapToStockTokenEntity(StockTokenDto stockTokenDto);

    CryptocurrencyDto mapToCryptocurrencyDto(Cryptocurrency cryptocurrency);

    CryptocurrencyDto mapToStockTokenDto(StockToken stockToken);

    default StockDto mapToDto(Stock stock) {

        if (stock instanceof Cryptocurrency cryptocurrency)
            return mapToCryptocurrencyDto(cryptocurrency);

        if (stock instanceof StockToken stockToken)
            return mapToStockTokenDto(stockToken);

        return null;
    }

    default Stock mapToEntity(StockDto stockDto) {

        if (stockDto instanceof CryptocurrencyDto cryptocurrencyDto)
            return mapToCryptocurrencyEntity(cryptocurrencyDto);

        if (stockDto instanceof StockTokenDto stockTokenDto)
            return mapToStockTokenEntity(stockTokenDto);

        return null;
    }
}
