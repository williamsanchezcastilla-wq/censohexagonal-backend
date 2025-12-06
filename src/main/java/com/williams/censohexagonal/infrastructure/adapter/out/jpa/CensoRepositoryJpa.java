package com.williams.censohexagonal.infrastructure.adapter.out.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CensoRepositoryJpa extends JpaRepository<CensoEntity, Long> {
}
