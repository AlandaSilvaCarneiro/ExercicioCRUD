package ativ.crud.aticrud.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ativ.crud.aticrud.Model.ModelParkingSpot;



@Repository
public interface RepositoryParkingSpot extends JpaRepository <ModelParkingSpot,UUID>{
    
}
