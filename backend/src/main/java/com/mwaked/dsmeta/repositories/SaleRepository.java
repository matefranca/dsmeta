package com.mwaked.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mwaked.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
