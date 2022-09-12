package com.jv.TraderUC.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jv.TraderUC.domain.Trader;

public interface TraderDAO extends JpaRepository<Trader, Long> {
	Trader findByEmail(String email);
}
