package com.innowise.stockexchange.entity;

import com.innowise.stockexchange.util.EntityConstant;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = EntityConstant.WalletStockEntity.WALLET_STOCK_TABLE_NAME)
public class WalletStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = EntityConstant.WalletStockEntity.WALLET_ID_FIELD_NAME)
    private Wallet wallet;

    @Column(length = EntityConstant.WalletStockEntity.WALLET_STOCK_SYMBOL_COLUMN_LENGTH)
    private String symbol;

    private BigDecimal amount;

    private BigDecimal totalBalance;
}
