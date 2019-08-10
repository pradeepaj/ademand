package com.hcl.demand.supply.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.demand.supply.entity.Manager;
@Repository
public interface IManagerRepository extends JpaRepository<Manager, Long> {

	
}
