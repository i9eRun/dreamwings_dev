package com.nalgae.dreamnalgae.repository.wbas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nalgae.dreamnalgae.entity.wbas.Cust;

public interface CustRepository extends JpaRepository<Cust, String> {
   // 기본 CRUD 제공공 
}
