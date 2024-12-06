package com.slc.Smart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slc.Smart.Entity.category;

@Repository
public interface categoryRepository extends JpaRepository<category, Long>{

}
