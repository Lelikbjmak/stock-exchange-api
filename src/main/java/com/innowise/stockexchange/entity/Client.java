package com.innowise.stockexchange.entity;

import com.innowise.stockexchange.entityenum.SexEnum;
import com.innowise.stockexchange.util.EntityConstant;
import com.innowise.stockexchange.util.ValidationConstant;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = EntityConstant.ClientEntity.CLIENT_TABLE_NAME)
public class Client {

    @Id
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = EntityConstant.CommonColumn.ID_FIELD)
    private User user;

    @Column(length = ValidationConstant.Client.NAME_COLUMN_LENGTH)
    private String firstName;

    @Column(length = ValidationConstant.Client.NAME_COLUMN_LENGTH)
    private String lastName;

    @Column(length = ValidationConstant.Client.NAME_COLUMN_LENGTH)
    private String middleName;

    private int age;

    @Column(length = ValidationConstant.Client.SEX_COLUMN_LENGTH)
    @Enumerated(EnumType.STRING)
    private SexEnum sex;

    @Column(length = ValidationConstant.Client.PASSPORT_NUMBER_COLUMN_LENGTH)
    private String passportNumber;

    private LocalDate birthday;
}
