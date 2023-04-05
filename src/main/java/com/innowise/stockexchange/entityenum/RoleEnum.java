package com.innowise.stockexchange.entityenum;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.EnumSet;
import java.util.Set;

@Getter
@RequiredArgsConstructor
public enum RoleEnum {
    ROLE_ADMIN(EnumSet.of(AuthorityEnum.DELETE, AuthorityEnum.CREATE_ADMIN, AuthorityEnum.READ, AuthorityEnum.REGISTER)),
    ROLE_USER(EnumSet.of(AuthorityEnum.READ, AuthorityEnum.REGISTER));

    private final Set<AuthorityEnum> authorityEnumSet;
}
