package com.innowise.stockexchange.repo;

import com.innowise.stockexchange.entity.Authority;
import com.innowise.stockexchange.entityenum.AuthorityEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {

    Optional<Authority> findByName(AuthorityEnum authorityEnum);

}
