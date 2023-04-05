package com.innowise.stockexchange.entity;

import com.innowise.stockexchange.util.EntityConstant;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = EntityConstant.UserEntity.USER_ENTITY_TABLE_NAME)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = EntityConstant.UserEntity.USERNAME_FIELD_LENGTH)
    private String username;

    private String password;

    @Column(length = EntityConstant.UserEntity.MAIL_FIELD_LENGTH)
    private String mail;

    @OneToOne(mappedBy = EntityConstant.UserEntity.USER_ENTITY_NAME,
            fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Wallet wallet;

    @OneToOne(mappedBy = EntityConstant.UserEntity.USER_ENTITY_NAME,
            cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Client client;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = EntityConstant.UserRole.USER_ROLE_TABLE_NAME,
            joinColumns = @JoinColumn(name = EntityConstant.UserRole.USER_ID_FIELD_NAME),
            inverseJoinColumns = @JoinColumn(name = EntityConstant.UserRole.ROLE_ID_FIELD_NAME))
    private Set<Role> roles;

    private boolean accountNonLocked;

    @CreationTimestamp
    private LocalDateTime registrationDate;

    @UpdateTimestamp
    private LocalDateTime lastTimeUpdated;
}
