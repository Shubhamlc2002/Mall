package com.slc.Smart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slc.Smart.Entity.product;
@Repository
public interface productRepository extends JpaRepository<product, Long> {

}
