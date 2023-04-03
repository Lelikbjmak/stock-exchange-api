package com.innowise.stockexchange.entity;

import com.innowise.stockexchange.util.EntityConstant;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = EntityConstant.StockCollection.STOCK_DOCUMENT_COLLECTION_NAME)
public abstract class Stock {

    @Id
    private String id;

    @Indexed(unique = true)
    private String symbol;

    @Indexed(unique = true)
    private String name;

    @CreationTimestamp
    private LocalDateTime created;

}
