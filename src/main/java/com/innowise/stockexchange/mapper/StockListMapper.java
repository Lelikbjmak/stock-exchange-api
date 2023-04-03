package com.innowise.stockexchange.mapper;

import com.innowise.stockexchange.dto.CryptocurrencyDto;
import com.innowise.stockexchange.dto.StockDto;
import com.innowise.stockexchange.dto.StockTokenDto;
import com.innowise.stockexchange.entity.Cryptocurrency;
import com.innowise.stockexchange.entity.Stock;
import com.innowise.stockexchange.entity.StockToken;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        uses = StockMapper.class)
public interface StockListMapper {

    List<Stock> mapToCryptocurrencyList(List<CryptocurrencyDto> cryptocurrencyDtoList);

    List<Stock> mapToStockTokenList(List<StockTokenDto> stockTokenDtoList);

    CryptocurrencyDto mapToCryptocurrencyDto(Cryptocurrency cryptocurrency);

    StockTokenDto mapToStockTokenDto(StockToken stockToken);

    List<Stock> mapToEntityList(List<StockDto> stockDtoList);

    default List<StockDto> mapToDtoList(List<Stock> entityList) {

        List<StockDto> stockDtoList = new ArrayList<>();

        for (Stock stock :
                entityList) {
            if (stock instanceof Cryptocurrency cryptocurrency)
                stockDtoList.add(mapToCryptocurrencyDto(cryptocurrency));
            else if (stock instanceof StockToken stockToken)
                stockDtoList.add(mapToStockTokenDto(stockToken));
        }

        return stockDtoList;
    }

    default List<CryptocurrencyDto> mapToCurrencyDtoList(List<Cryptocurrency> cryptocurrencyList) {

        List<CryptocurrencyDto> cryptocurrencyDtoList = new ArrayList<>();

        for (Cryptocurrency cryptocurrency :
                cryptocurrencyList)
            cryptocurrencyDtoList.add(mapToCryptocurrencyDto(cryptocurrency));

        return cryptocurrencyDtoList;
    }


    default List<StockTokenDto> mapToStockTokenDtoList(List<StockToken> stockTokenList) {

        List<StockTokenDto> stockTokenDtoList = new ArrayList<>();

        for (StockToken stockToken :
                stockTokenList)
            stockTokenDtoList.add(mapToStockTokenDto(stockToken));

        return stockTokenDtoList;
    }
}
