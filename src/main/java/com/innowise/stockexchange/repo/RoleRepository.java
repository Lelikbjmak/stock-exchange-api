package com.innowise.stockexchange.repo;

import com.innowise.stockexchange.entity.Role;
import com.innowise.stockexchange.entityenum.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(RoleEnum roleEnum);

}
