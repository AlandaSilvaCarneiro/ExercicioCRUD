package ativ.crud.aticrud.Controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ativ.crud.aticrud.Dtos.DTOParkingSpot;
import ativ.crud.aticrud.Model.ModelParkingSpot;
import ativ.crud.aticrud.Service.ServiceParkingSpot;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/parkingSpot")
public class ControllerParkingSpot {
    @Autowired
    private ServiceParkingSpot serviceParkingSpot;

    @GetMapping
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid DTOParkingSpot dtoParkingSpot) {
        var parkingSpotsave = new ModelParkingSpot();
        BeanUtils.copyProperties(dtoParkingSpot, parkingSpotsave);
        parkingSpotsave.setRegistretiondate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceParkingSpot.salve(parkingSpotsave));
    }
}
