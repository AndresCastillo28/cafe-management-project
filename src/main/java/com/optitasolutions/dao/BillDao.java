package com.optitasolutions.dao;

import com.optitasolutions.POJO.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface BillDao extends JpaRepository<Bill, Integer> {
}
