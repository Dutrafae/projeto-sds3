package com.arth.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arth.dsvendas.entities.Sale;


public interface SaleRepository extends JpaRepository<Sale, Long>{

}
