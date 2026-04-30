package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.models.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer>{

}
