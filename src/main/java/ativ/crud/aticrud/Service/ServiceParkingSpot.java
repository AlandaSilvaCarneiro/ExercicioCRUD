package ativ.crud.aticrud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ativ.crud.aticrud.Model.ModelParkingSpot;
import ativ.crud.aticrud.Repository.RepositoryParkingSpot;

@Service
public class ServiceParkingSpot {
    @Autowired
    private RepositoryParkingSpot repositoryParkingSpot;

    public ModelParkingSpot salve(ModelParkingSpot modelParkingSpot){
        repositoryParkingSpot.save(modelParkingSpot);
        return modelParkingSpot;
    }
}
