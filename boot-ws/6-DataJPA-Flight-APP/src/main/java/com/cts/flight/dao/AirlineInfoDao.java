package com.cts.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.flight.entity.AirlineInfo;

public interface AirlineInfoDao extends JpaRepository<AirlineInfo, Integer> {

}
