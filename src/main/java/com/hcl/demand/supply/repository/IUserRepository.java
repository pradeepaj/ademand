package com.hcl.demand.supply.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.demand.supply.entity.User;
@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

	User findByUserNameAndPassword(String userName, String password);

}
