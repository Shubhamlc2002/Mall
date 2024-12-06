package com.slc.Smart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slc.Smart.Entity.coustomer;
@Repository
public interface CoustomerRepository extends JpaRepository<coustomer, Long> {

}
