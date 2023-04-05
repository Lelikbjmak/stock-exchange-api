package com.innowise.stockexchange.repo;

import com.innowise.stockexchange.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

    @Query("SELECT wallet FROM Wallet wallet WHERE wallet.uuid = :uuid")
    Optional<Wallet> findByUuid(@Param("uuid") UUID uuid);
}
