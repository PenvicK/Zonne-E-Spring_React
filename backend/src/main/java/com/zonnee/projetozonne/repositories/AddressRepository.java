package com.zonnee.projetozonne.repositories;

import com.zonnee.projetozonne.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}

