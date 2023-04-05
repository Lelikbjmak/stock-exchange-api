package com.innowise.stockexchange.entity;

import com.innowise.stockexchange.util.EntityConstant;
import jakarta.persistence.*;
import lombok.*;

import java.util.Map;
import java.util.UUID;

@Entity
@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = EntityConstant.StackWalletEntity.WALLET_TABLE_NAME)
public class Wallet {

    @Id
    private long id;

    private UUID uuid = UUID.randomUUID();

    @Column(length = EntityConstant.StackWalletEntity.WALLET_NAME_FIELD_LENGTH)
    private String walletName;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = EntityConstant.CommonColumn.ID_FIELD)
    private User user;

    @OneToMany(mappedBy = EntityConstant.StackWalletEntity.WALLET_FIELD,
            cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.LAZY)
    @MapKey(name = EntityConstant.AbstractStockDocument.SYMBOL_FIELD)
    private Map<String, WalletStock> stockMap;

    private boolean walletNonLocked;
}
