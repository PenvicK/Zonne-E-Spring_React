package com.zonnee.projetozonne.repositories;

import com.zonnee.projetozonne.entities.FederativeUnit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FederativeUnitRepository extends JpaRepository<FederativeUnit, Long> {
    FederativeUnit findByName (String name);
}
