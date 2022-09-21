package com.eql.dao;

import com.eql.models.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface VehiculeDAO extends JpaRepository<Vehicule,Long> {

}
