package com.slc.Smart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slc.Smart.Entity.Mall;

@Repository
public interface mallRepository extends JpaRepository<Mall, Long> {

}
