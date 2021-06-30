package com.zonnee.projetozonne.repositories;

import com.zonnee.projetozonne.entities.Dealership;
import com.zonnee.projetozonne.entities.UserTeste;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserTesteRepository extends JpaRepository<UserTeste, Long> {
    Optional<UserTeste> findByUsername(String username);
}
