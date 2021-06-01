package com.zonnee.projetozonne.repositories;

import com.zonnee.projetozonne.entities.Dealership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealershipRepository extends JpaRepository<Dealership, Long> {
    Dealership findByName (String name);
}
