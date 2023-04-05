package com.innowise.stockexchange.entity;

import com.innowise.stockexchange.entityenum.RoleEnum;
import com.innowise.stockexchange.util.EntityConstant;
import com.innowise.stockexchange.util.ValidationConstant;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = EntityConstant.RoleEntity.ROLE_ENTITY_NAME)
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true,
            length = ValidationConstant.Role.ROLE_NAME_COLUMN_LENGTH)
    private RoleEnum name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = EntityConstant.RoleAuthority.ROLE_AUTHORITY_TABLE_NAME,
            joinColumns = @JoinColumn(name = EntityConstant.RoleAuthority.ROLE_ID_FIELD),
            inverseJoinColumns = @JoinColumn(name = EntityConstant.RoleAuthority.AUTHORITY_ID_FIELD)
    )
    private Set<Authority> authorities;

    @ManyToMany(mappedBy = EntityConstant.RoleEntity.ROLE_USER_MAPPING, fetch = FetchType.LAZY)
    private Set<User> userSet;
}
