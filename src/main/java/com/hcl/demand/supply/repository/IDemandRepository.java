package com.hcl.demand.supply.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.demand.supply.entity.Demand;

public interface IDemandRepository extends JpaRepository<Demand, Long> {

}
