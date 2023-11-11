package com.seguridad.botnet.repository;

import com.seguridad.botnet.model.Attack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttackRepository extends JpaRepository<Attack, Integer> {
}
