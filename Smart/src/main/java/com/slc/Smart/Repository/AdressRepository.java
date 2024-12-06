package com.slc.Smart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slc.Smart.Entity.address;

@Repository
public interface AdressRepository extends JpaRepository<address, Long>{

}
