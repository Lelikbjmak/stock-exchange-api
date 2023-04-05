package com.innowise.stockexchange.repo;

import com.innowise.stockexchange.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
