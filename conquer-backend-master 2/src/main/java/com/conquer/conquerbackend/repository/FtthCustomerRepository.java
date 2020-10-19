package com.conquer.conquerbackend.repository;


import com.conquer.conquerbackend.entity.FtthCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FtthCustomerRepository extends JpaRepository<FtthCustomer,Integer> {
    FtthCustomer findByLandLine(Long landLine);
}
