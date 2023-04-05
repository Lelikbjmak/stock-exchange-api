package com.innowise.stockexchange.entity;


import com.innowise.stockexchange.entityenum.AuthorityEnum;
import com.innowise.stockexchange.util.EntityConstant;
import com.innowise.stockexchange.util.ValidationConstant;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = EntityConstant.AuthorityEntity.AUTHORITY_ENTITY_NAME)
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true,
            length = ValidationConstant.Authority.AUTHORITY_NAME_COLUMN_LENGTH)
    private AuthorityEnum name;
}
