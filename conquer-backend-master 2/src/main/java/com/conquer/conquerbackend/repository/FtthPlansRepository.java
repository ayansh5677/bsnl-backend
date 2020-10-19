package com.conquer.conquerbackend.repository;

import com.conquer.conquerbackend.entity.FtthPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FtthPlansRepository extends JpaRepository<FtthPlan, Integer> {

}
