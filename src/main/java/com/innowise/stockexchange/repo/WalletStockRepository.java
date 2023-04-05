package com.innowise.stockexchange.repo;

import com.innowise.stockexchange.entity.WalletStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletStockRepository extends JpaRepository<WalletStock, Long> {

}
