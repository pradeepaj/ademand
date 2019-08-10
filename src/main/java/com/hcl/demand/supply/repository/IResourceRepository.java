package com.hcl.demand.supply.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.demand.supply.entity.Resource;
@Repository
public interface IResourceRepository extends JpaRepository<Resource, Long> {

	List<Resource> findAllByStatus(String avialable);
	@Query("Select r from Resource r " + "where r.primarySkill=:primarySkill "

			+ "and r.secondarySkill=:secondarySkill and r.location=:location  and r.experience>=:experience  and r.level=:level  "

			+ "and r.otherSkill=:otherSkill")

	List<Resource> findExactSkills(@Param("primarySkill") String primarySkill,

			@Param("secondarySkill") String secondarySkill, @Param("location") String location,

			@Param("experience") int experience, @Param("otherSkill") String otherSkill,

			@Param("level") String level);

	



	@Query("Select r from Resource r " + "where r.primarySkill=:primarySkill "

			+ "or r.secondarySkill=:secondarySkill or r.location=:location  or r.experience>=:experience  or r.level=:level  "

			+ "or r.otherSkill=:otherSkill")

	List<Resource> findRecommendedSkills(@Param("primarySkill") String primarySkill,

			@Param("secondarySkill") String secondarySkill, @Param("location") String location,

			@Param("experience") int experience, @Param("otherSkill") String otherSkill,

			@Param("level") String level);

}