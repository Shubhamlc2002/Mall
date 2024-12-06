package com.slc.Smart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slc.Smart.Entity.Staff;
@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

}
